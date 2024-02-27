public class JPA06 {
    public static void main(String[] args) {
        System.out.printf("f(%f) = %.4f%n",-3.2,ff(-3.2));
        System.out.printf("f(%f) = %.4f%n",-2.1,ff(-2.1));
        System.out.printf("f(%f) = %.4f%n",0.0,ff(0.0));
        System.out.printf("f(%f) = %.4f",2.1,ff(2.1));
    }
    public static double ff(double x){
        return 3 *(Math.pow(x,3))+ 2*x -1;
    }
}
