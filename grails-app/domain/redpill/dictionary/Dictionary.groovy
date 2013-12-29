package redpill.dictionary

import redpill.Address
import redpill.Contact

class Dictionary  implements Serializable{

    UUID id

    String code
    String title
    String description

    Dictionary parent
    List<DictionaryItem> items

    static hasMany = [items : DictionaryItem]

    static constraints = {
        id generator: 'uuid2'
        code nullable: true
        title nullable: false
        items nullable: true
        parent nullable: true
        description nullable: true
    }

    @Override
    public java.lang.String toString() {
        return "Dictionary{" +
                "version=" + version +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", parent=" + parent +
                ", items=" + items +
                '}';
    }
}
