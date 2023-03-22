import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Vehiculo implements Motorizado{
    private List<Pasajero> pasajeros;
    private List<Rueda> ruedas;
    public Vehiculo(){
        this.ruedas = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
    }
    public boolean ponerRueda(Rueda rueda, int index){
        if (ruedas.size() <= index){
            ruedas.add(index, rueda);
            return true;
        } else {
            System.out.println("La rueda ya está puesta");
            return false;
        }
    }
    public void viajar(Date fecha){
        pasajeros.forEach(pasajero -> {
            System.out.println(pasajero.nombre() + " has viajado al " + fecha.toString());
        });
    }
}