package redpill

class Contact implements Serializable{

    UUID id
    String value
    ContactType type = ContactType.UNKNOWN
    Integer priority = -100

    public Contact(){
        this.id = UUID.randomUUID();
        value = ''
        type = ContactType.UNKNOWN
        priority = -100
    }

    static constraints = {
        id generator: 'uuid2'
        value nullable: false, size: 1..512
        priority nullable: false
    }

    @Override
    public java.lang.String toString() {
        return "Contact{" +
                "version=" + version +
                ", id=" + id +
                ", value='" + value + '\'' +
                ", type=" + type +
                ", priority=" + priority +
                '}';
    }
}
