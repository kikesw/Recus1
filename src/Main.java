public class Main {
    public static void main(String[] args){

        Pais p1 = new Pais("USA");
        Pais p2 = new Pais("Rusia");
        Pais p3 = new Pais("España");
        Pais p4 = new Pais("Alemania");
        Pais p5 = new Pais("China");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
    public static Pais ganador = null;
}




