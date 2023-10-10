public class Laptop {
    private String producator;
    private int ram;
    private String arhitecturaProcesor;
    private double pret;

    public Laptop(String producator, int ram, String arhitecturaProcesor, double pret) {
        this.producator = producator;
        this.ram = ram;
        this.arhitecturaProcesor = arhitecturaProcesor;
        this.pret = pret;
    }
    public void afiseazaCapacitateRam() {
        System.out.println("Capacitatea  RAM a laptopului"+ producator +"este: " + ram + " GB");
    }

    public boolean cautarePret(double valoareCautata) {
        return pret <= valoareCautata;
    }
    public String getProducator()
    {
        return producator;
    }
}