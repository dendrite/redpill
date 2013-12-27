package redpill

class Document implements Serializable{

    UUID id;//  = UUID.randomUUID().toString()
    Date createdAt = new Date()

    static constraints = {
        id generator: 'uuid2', bindable: true
    }
}
