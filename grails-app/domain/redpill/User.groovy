package redpill

class User extends Document implements Serializable{

    String userName;
    String password;

    String toString(){
        return userName;
    }

    static constraints = {
    }
}
