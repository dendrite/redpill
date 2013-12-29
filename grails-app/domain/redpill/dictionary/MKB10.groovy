package redpill.dictionary

class MKB10 extends Dictionary implements Serializable{

    final String title = 'Международный справочник'

    public String getTitle(){
        return 'FFF'
    }

    static constraints = {
    }

    static mapping = {
        table 'dictionary_mkb10'
        version true
    }
}
