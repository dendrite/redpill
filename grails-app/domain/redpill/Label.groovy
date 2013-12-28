package redpill

class Label implements Serializable {

    UUID id
    LabelType type = LabelType.TEXT
    byte[] value

    String getText() {
        if (!this.isIcon()) {
            if (value != null && value.length > 0) {
                return new String(value, "UTF-8");
            }
        }
        return null
    }

    boolean isIcon() {
        return !type.equals(LabelType.TEXT)
    }

    static constraints = {
        id generator: 'uuid2'
        value nullable: true
    }

    @Override
    public java.lang.String toString() {
        return "Label{" +
                "version=" + version +
                ", id=" + id +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
