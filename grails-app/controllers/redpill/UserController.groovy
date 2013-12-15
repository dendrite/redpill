package redpill

import org.springframework.dao.DataIntegrityViolationException

class UserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "login", params: params)
    }

    def authenticate = {
        log.info("LOGIN")
        println params;
        println params.username
        println params.password

        def user = User.findByUserNameAndPassword(params.username, params.password)
        println "Found users:" + user
        if (!user) {
            flash.message = 'LOGIN - WRONG!'
            redirect( action: 'index')
        } else {
            flash.message = 'LOGIN - OK!'
            session.user = user;
            redirect(controller: "person", action: "list")
        }

//        render "LOGIN - OK!"
//        redirect (action: 'index')
    }

    def login() {

    }

    def logout(){
        session.user = null;
        redirect(action: 'index')
    }

    def handleLogin() {
        println "Handle Login"
//        def hashPassd = DU.md5Hex(params.password)
        println params.userName
        println params.password
// find the user name
        def user = User.findByUserNameAndPassword(params.userName, params.password)
        if (!user) {
            flash.message = "User not found for userName: ${params.userName}"
            redirect(action: 'index')
            return
        } else {
            session.user = user
            redirect(controller: 'todo')
        }
    }
}
