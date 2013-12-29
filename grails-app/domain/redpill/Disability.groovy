package redpill

class Disability implements Serializable{

    UUID id
    DisabilityType type = DisabilityType.NONE

    static constraints = {
        id generator: 'uuid2'
        type nullable: false
    }
}
