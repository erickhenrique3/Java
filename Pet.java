public class Pet {

    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false; // Pet entra sujo
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
