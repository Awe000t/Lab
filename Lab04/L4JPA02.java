import java.util.Scanner;

public class L4JPA02 {
    public static void main(String[] args) {
        double s=0,g;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int p = sc.nextInt();
        for(int i=1;i<=p;i++){
            System.out.printf("第%d個學生的成績:",i);
            g = sc.nextDouble();
            s+=g;
        }
        sc.close();
        System.out.print("人數:"+p);
        System.out.print("人數:"+s);
        System.out.print("人數:"+(float)s/p);

    }
    
}
