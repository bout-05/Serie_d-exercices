class IdGenerator{
    private static long next = 1;
    
    public static synchronized long nextId(){
        return next++;
    }

    public String toString(){
        return "La valeur est :"+ next+".\n";
    }

}
