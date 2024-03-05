import java.util.Scanner;

public class L3JPA01 {
    public static void main(String[] args) {
        int i,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        i = sc.nextInt();
        sc.close();
        for(int t=1;t<=i;t++){
            s+=t;
        }
        System.out.printf("1 + ... + %d = %d",i,s);
    }
    
}