import java.util.Random;

public class Planeta {

    public int coordenadas(){
        return (int) (1000 * Math.random());
    }

    public boolean esHabitable() {
        Random r = new Random();
        int probabilidad = r.nextInt();
        if(probabilidad>0.25){
            return true;
        }else{
            return false;
        }
    }
}