import java.util.HashSet;

public class Carretera {
    public static void main(String[] args) {
        HashSet<Vehiculo> vehiculos = new HashSet<>();
        vehiculos.add(new Motocicleta(0.7F));
        vehiculos.add(new Motocicleta(0.7F));
        vehiculos.add(new XWing("RD-D2"));
    }
}