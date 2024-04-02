import java.util.Scanner;

public class L5JPA03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m,n;
            System.out.print("Input m :");
            m = sc.nextInt();
            if(m==999){
                break;
            }
            System.out.print("Input n :");
            n = sc.nextInt();
            System.out.printf("最大公因數=%d\n",gcd(m,n));
        }
        sc.close();
        
    }
    static int gcd(int m,int n ){
        int pre = 0;
        pre=Math.max(m,n)%Math.min(m,n);
        if(pre==0){
            return Math.min(m,n);
        }else{
            return gcd(Math.min(m,n),pre);
        } 
    }
}
