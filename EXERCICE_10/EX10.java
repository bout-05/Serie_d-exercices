final class MathUtil {

    private MathUtil(){
        throw new UnsupportedOperationException("Classe utilitaire — instanciation interdite.");
    }

    public static int clamp(int value,int min ,int max){
        if(min>value){
            return min;
        }else if(max>value){
            return max;
        }else{
            return value;
        }
    }
}
