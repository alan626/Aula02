public class Config {

    public static int minPatas = 0;
    public static int maxPatas = 4;

    public static boolean numPatas(Animal patas){
        if(patas.getquantidadPatas() <= maxPatas && patas.getquantidadPatas() >= minPatas){

            return true;
        }
        return false;
    }
    
}
