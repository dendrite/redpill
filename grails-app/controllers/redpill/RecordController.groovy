package redpill

import org.springframework.dao.DataIntegrityViolationException

class RecordController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [recordInstanceList: Record.list(params), recordInstanceTotal: Record.count()]
    }


    def create() {
        [recordInstance: new Record(params)]
    }

    def save() {
        def recordInstance = new Record(params)
        if (!recordInstance.save(flush: true)) {
            render(view: "create", model: [recordInstance: recordInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'record.personLabel', default: 'Record'), recordInstance.id])
        redirect(action: "show", id: recordInstance.id)
    }

    def show(String id) {
        def recordInstance = Record.findById(id)
        if (!recordInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "list")
            return
        }

        [recordInstance: recordInstance]
    }

    def edit(String id) {
        def recordInstance = Record.findById(id)
        if (!recordInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "list")
            return
        }

        [recordInstance: recordInstance]
    }

    def update(String id, Long version) {
        def recordInstance = Record.findById(id)
        if (!recordInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (recordInstance.version > version) {
                recordInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'record.personLabel', default: 'Record')] as Object[],
                          "Another user has updated this Record while you were editing")
                render(view: "edit", model: [recordInstance: recordInstance])
                return
            }
        }

        recordInstance.properties = params

        if (!recordInstance.save(flush: true)) {
            render(view: "edit", model: [recordInstance: recordInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'record.personLabel', default: 'Record'), recordInstance.id])
        redirect(action: "show", id: recordInstance.id)
    }

    def delete(String id) {
        def recordInstance = Record.get(id)
        if (!recordInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "list")
            return
        }

        try {
            recordInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'record.personLabel', default: 'Record'), id])
            redirect(action: "show", id: id)
        }
    }


    def superLink(){
        println "SUPER LINK"

        log.info("SUPER LINK")
        redirect(action: "show", id: 1)
    }
}
