package redpill

/**
 *
 */
public enum GenderType {
    MALE("мужчина"),
    FEMALE("женщина")

    String name

    GenderType(String name) {
        this.name = name
    }

    public String getName() {
        return this.name;
    }
}