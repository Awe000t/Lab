import java.util.Scanner;

public class L5JPA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0<=n<=16):");
            int n = sc.nextInt();
            if(n==999){
                break;
            }
            System.out.printf("%d的階乘(迴圈) = %d\n",n,loop(n));
            System.out.printf("%d的階乘(尾遞迴) = %d\n",n,factail(n,1));
        }
        sc.close();
    }
    static int loop(int a){
        int ans = 1;
        for(int c=1;c<=a;c++){
            ans*=c;
        }
        return ans;
    }
    static int factail(int a,int b){
        if(a==1){
            return b;
        }else{
            return factail(a-1,a*b);
        }
    }
}

