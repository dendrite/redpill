package redpill

class Record extends Document implements Serializable{

    String name
    String description

    static constraints = {
        id generator: 'uuid2'
    }
}
