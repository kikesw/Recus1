public class Pais extends Thread{

    String nombre;
    Sonda sonda;

    public Pais(String nombre){
        this.nombre = nombre;
        this.sonda = new Sonda(new Planeta(),this);
    }

    @Override
    public void run() {
        sonda.lanzarSonda();
    }
    public synchronized void notificarExito(){
        if (Main.ganador==null){
            Main.ganador = this;
            System.out.println("La sonda del pais "+nombre+" ha ganado");
        }
    }

}

