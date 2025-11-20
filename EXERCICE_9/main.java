public class main {
    public static void main(String [] args){
        IdGenerator id = new IdGenerator();
        id.nextId();
        id.nextId();
        id.nextId();
        id.nextId();
        id.nextId();
        id.nextId();

        System.out.println(id.toString());
    }
}
