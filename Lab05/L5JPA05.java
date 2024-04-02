public class L5JPA05 {
    public static void main(String[] args) {
        System.out.println("Add two interger: 2 , 3");
        System.out.println("Add two double: 5.2 , 4.3");
        System.out.println("Add two String: I love , Java!!");
        System.out.printf("%d %f %s",add(2,3),add(5.2,4.3),add("I love ","Java!!"));
    }
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static String add(String a,String b){
        return a+b;
    }
}
