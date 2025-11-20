class Point{
        private int x;
        private int y;

        Point(){
            this(0,0);
        }

        Point(int X , int Y){
            this.x = X;
            this.y = Y;
        }

        void translate(int dx,int dy){
            this.x += dx;
            this.y += dy;
        }

        @Override
        public String toString(){
            return "X :'"+this.x+"' , Y : '" + this.y + "' .";
        } 
    }