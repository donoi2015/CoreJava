package lynda.advanced.enums;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIO("Ligurio"),
    GOLDEN("Golden"), PICHOLINE("Picholine");
    private String nameAsString;

    private OliveName(String nameAsString) {
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}
