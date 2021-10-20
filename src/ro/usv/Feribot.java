package ro.usv;

public class Feribot extends NavaCroaziera {
    private int nrAuto;

    public Feribot(String nume, String pavilion, int nrPasageri, int nrAuto) {
        super(nume, pavilion, nrPasageri);
        this.nrAuto = nrAuto;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nrAuto = " + nrAuto;
    }

    @Override
    public void utilizare() {
        System.out.println("Transport vehicule si pasageri");
    }
}
