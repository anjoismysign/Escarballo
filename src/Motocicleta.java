public class Motocicleta extends Vehiculo{
    public Motocicleta(float diametroRueda){
        super();
        ponerRueda(new Rueda(diametroRueda), 0);
        ponerRueda(new Rueda(diametroRueda), 1);
        encender();
    }
    @Override
    public void encender() {
        System.out.println("brrrooom brooom");
    }
    @Override
    public void apagar() {
        System.out.println("peep peep");
    }
}
