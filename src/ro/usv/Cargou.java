package ro.usv;

public class Cargou extends Nava{
    private int Capacitate;

    public Cargou(String nume, String pavilion, int capacitate) {
        super(nume, pavilion);
        Capacitate = capacitate;
    }

    @Override
    public void utilizare() {
        System.out.println("Transport marfuri");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", capacitateIncarcare = " + Capacitate;
    }
}
