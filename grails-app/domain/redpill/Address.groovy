package redpill

class Address {

    UUID id
    String name
    AddressType type = AddressType.UNKNOWN

    static constraints = {
        id generator: 'uuid2'
        name nullable: false, size: 1..255
        type nullable: false
    }
}
