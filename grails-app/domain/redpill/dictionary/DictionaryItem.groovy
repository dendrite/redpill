package redpill.dictionary

class DictionaryItem implements Serializable, Comparable<DictionaryItem> {

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

    @Override
    int compareTo(DictionaryItem otherDictionaryItem) {
        if (otherDictionaryItem != null) {
            if (this.code != null && otherDictionaryItem.code != null) {
                return this.code.compareTo(otherDictionaryItem.code)
            }
        }
        return 0
    }

    @Override
    public String toString() {
        return "\n\t\tDictionaryItem{" +
                "version=" + version +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description +
                '}';
    }

}
