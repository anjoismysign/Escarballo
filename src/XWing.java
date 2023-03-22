public class XWing extends Vehiculo{
    private Droide droide;
    public XWing(String droide){
        super();
        System.out.println(droide+ " ha sido instalado");
        encender();
    }
    @Override
    public void encender() {
        System.out.println("weeeeeeeeeeeeeeep");
    }
    @Override
    public void apagar() {
        System.out.println("shooooop");
    }
    public Droide getDroide(){
        return droide;
    }
}