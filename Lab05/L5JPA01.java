import java.util.Scanner;

public class L5JPA01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0<=n<=16):");
            int n = sc.nextInt();
            System.out.printf("%d的階乘 = %d\n",n,fac(n));
            if(n==999){
                break;
            }
        }
        sc.close();
    }
    static int fac(int a){
        if(a==0){
            return 1;
        }else{
            return a*fac(a-1);
        }
    }
}
