package redpill.dictionary

class DictionaryItem implements Serializable {

    UUID id

    String code
    String name
    String description

    Dictionary dictionary

    static belongsTo = [dictionary: Dictionary]

    static constraints = {
        id generator: 'uuid2'
        code nullable: true
        name nullable: false, size: 0..255
        description nullable: true, size: 0..2000
        dictionary nullable: false
    }
}
