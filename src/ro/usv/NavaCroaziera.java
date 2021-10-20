package ro.usv;

public class NavaCroaziera extends Nava {
    private int nrPasageri;

    public NavaCroaziera(String nume, String pavilion, int nrPasageri) {
        super(nume, pavilion);
        this.nrPasageri = nrPasageri;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nrPasageri = " + nrPasageri;
    }

    @Override
    public void utilizare() {
        System.out.println("Croaziere de lux");
    }
}
