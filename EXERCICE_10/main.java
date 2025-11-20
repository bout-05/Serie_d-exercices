public class main {
    public static void main(String []args){
        int res1 = MathUtil.clamp(23,4,8);
        System.out.println(res1);
        
        int res2 = MathUtil.clamp(3,14,8);
        System.out.println(res2);
        
        int res3 = MathUtil.clamp(3,6,8);
        System.out.println(res3);
    }
}
