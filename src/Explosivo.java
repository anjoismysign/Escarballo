public class Explosivo extends Contador implements Nocivo{

    private long encendido;

    public Explosivo(long encendido) {
        super();
        this.encendido = encendido;
    }

    public boolean puedeExplotar(){
        return transcurrido() >= encendido;
    }

    @Override
    public double potencia() {
        return 100.0;
    }

    @Override
    public boolean quema() {
        return true;
    }

    @Override
    public byte gradoDeQuemadura() {
        return 3;
    }
}