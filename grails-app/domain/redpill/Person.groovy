package redpill

class Person implements Serializable{

    UUID id

    String firstName
    String lastName
    String middleName
    GenderType gender = GenderType.MALE
    Date dateOfBirth

    Set<Address> addresses;
    Set<Contact> contacts
    Set<Person> parents

    Disability disability

    Label personLabel
    Label groupLabel

    String comment

    public Set<Contact> getContacts(){
        if (contacts == null){
            contacts = new HashSet<Contact>();
        }
        return this.contacts;
    }

    public void addContact(Contact contact){
        this.getContacts().add(contact)
    }


    static hasMany = [contacts : Contact, parents: Person, addresses: Address]

    static constraints = {
        id generator: 'uuid2'

        firstName nullable: false, size: 1..128, blank: false
        lastName nullable: false, size: 1..128, blank: false
        middleName nullable: true, size: 1..128, blank: true

        gender nullable: false
        dateOfBirth nullable: false

        addresses nullable: true
        contacts nullable: true
        parents nullable: true

        personLabel nullable: true
        groupLabel nullable: true

        comment nullable: true, size: 0..2000

    }

    static mapping = {
        table 'person'
        version true
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "version=" + version +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", contacts=" + contacts +
                ", parents=" + parents +
                ", personLabel=" + personLabel +
                ", groupLabel=" + groupLabel +
                ", comment='" + comment + '\'' +
                '}';
    }
}
