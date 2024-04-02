import java.util.Scanner;

public class L5JPA04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number :");
        int m = sc.nextInt();
        System.out.println("Ans:"+sum2(m));
        sc.close();
    }
    static int sum2(int m){
        if (m==1){
            return 2;
        }else{
            return sum2(m-1)+2*m;
        }
    }
}
