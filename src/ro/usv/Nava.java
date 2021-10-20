package ro.usv;

public abstract class Nava {
    private String nume;
    private String pavilion;

    public Nava(String nume, String pavilion) {
        this.nume = nume;
        this.pavilion = pavilion;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " - nume = " + nume  +
                ", pavilion = " + pavilion;
    }

    public String getNume() {
        return nume;
    }

    public abstract void utilizare();
}
