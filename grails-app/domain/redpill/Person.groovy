package redpill

class Person extends Document implements Serializable{

    String firstName
    String lastName
    String middleName
    Date dateOfBirth

    static hasMany = [records : Record]

    static constraints = {
//        id generator: 'uuid2'
//        uuid unique: true
//        id(unique: true, nullable: false)
    }

    static mapping = {
        table 'person'
        version true
//        id column: 'uuid', name: "id"
    }
}
