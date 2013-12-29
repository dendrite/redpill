package redpill.dictionary

class Privilege extends DictionaryItem implements Serializable{



    static constraints = {
    }

    static mapping = {
        table 'dictionary_privilege'
        version true
    }
}
