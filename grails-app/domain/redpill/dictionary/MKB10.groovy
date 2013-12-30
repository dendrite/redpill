package redpill.dictionary

class MKB10 extends Dictionary implements Serializable{

    public void setTitle(String title){
        this.title = '++ Международный справочник'
    }

    @Override
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
