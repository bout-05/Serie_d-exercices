final class Email {
    private final String value;

    Email(String V){
        if( V != null && V.contains("@") ){
            this.value = V;
        }else{
            throw new IllegalArgumentException("Email invalide : doit contenir '@'.");
        }
    }

    public String  getValue(){
        return this.value;
    }

    public String toString(){
        return "Value :"+ value+".\n";
    }

}