import java.util.Random;

public class Sonda extends Thread{
    //Constructor para que entre el pais..
    Pais pais;
    Planeta planeta;

    public Sonda(Planeta planeta,Pais pais){
        this.planeta = planeta;
        this.pais = pais;
    }


    public void lanzarSonda(){
        Random r = new Random();
        int contador = 0;
        int tiempoDestino = r.nextInt(3000)+3000;
        try {
            System.out.println(pais.nombre + ": Sonda lanzada");
            do {
                sleep(tiempoDestino);

                if (planeta.esHabitable()) {
                    System.out.println(pais.nombre + " ha encontrado vida en el planeta (" + planeta.coordenadas() + ")");
                    pais.notificarExito();
                    break;
                } else {
                    planeta = new Planeta();
                    System.out.println(pais.nombre + " no ha encontrado vida");
                    contador++;
                    if (contador == 3) {
                        System.out.println(pais.nombre + " se ha quedado sin combustible");
                        System.out.println(pais.nombre + " es una sonda fracasada :(");
                    }
                }

            } while (contador < 3);
        } catch(InterruptedException exception){
            exception.printStackTrace();
        }
    }

}