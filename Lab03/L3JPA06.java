import java.util.Scanner;

public class L3JPA06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Input:");
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m==999){
                break;
            }
            System.out.println(compute.xx(m, n));
        }
        sc.close();
    }
    public class compute{
        public static double xx(int m,int n){            
            return Math.pow(m,n);
        }
    }
}
