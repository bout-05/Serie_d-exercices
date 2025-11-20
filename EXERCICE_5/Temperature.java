public class Temperature {
    private double value;

    Temperature(double V){
        if(V < -273.15){
                throw new IllegalArgumentException("value < 0");
        }else
            this.value = V;
    }
    public double getValue(){
        return this.value;
    }
    public void setValue(double V){
        this.value = V;
    }
}
