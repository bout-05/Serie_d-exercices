package EXERCICE_1_2;
public class ex1{

    class Rectangle{
        private double  width;
        private double height;

        public Rectangle(double W,double H){
            this.width = W;
            this.height = H;
        }

        public void setWidth (double W){
            this.width = W;
        }

        public void setHeight (double H){
            this.height = H;
        }

        public double getHeight (){
            if(height <0){
                throw new IllegalArgumentException("Height < 0");
            }
            return this.height;
        }

        public double getWidth(){
            if(width <0){
                throw new IllegalArgumentException("Width < 0");
            }
            return this.width;
        }

        
    }
    
}