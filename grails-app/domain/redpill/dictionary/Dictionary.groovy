package redpill.dictionary

import redpill.Address
import redpill.Contact

class Dictionary  implements Serializable{

    UUID id

    String code
    String title
    String description

    Dictionary parent

    SortedSet<DictionaryItem> items
    boolean hasChildDictionary = false

    Dictionary setParent(Dictionary dictionary){
        this.parent = dictionary
        this.parent.hasChildDictionary = true
        return this
    }

    Dictionary add(DictionaryItem dictionaryItem){
        if (items == null){
            items = new TreeSet<DictionaryItem>();
        }
        if (dictionaryItem != null){
            dictionaryItem.dictionary = this
            items.add(dictionaryItem);
        }

        return this
    }

    Dictionary delete(DictionaryItem dictionaryItem){
        if (items == null){
            items = new TreeSet<DictionaryItem>();
        }
        items.remove(dictionaryItem);
        return this
    }

    boolean hasParent(){
        return parent != null;
    }

    boolean hasItems(){
        return (items != null && items.size() > 0)
    }

    static hasMany = [items : DictionaryItem]
    static hasOne = [parent: Dictionary]

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
        return "\n\tDictionary{" +
                "version=" + version +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hasChildDictionary='" + hasChildDictionary + '\'' +
                ", \nparent=" + parent +
                ", \nitems=" + items +
                '}';
    }
}
