import java.util.Scanner;

public class L3JPA05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter one value:");
        int s=1,n,t=0;
        n = sc.nextInt();
        sc.close();
        if(n<=0 || n>10){
            System.out.print("Error, the value is out of range.");
        }else{
            while(t<n){
                t++;
                s*=t;
            }
            System.out.printf("%d! = %d",n,s);
        }
    }
}
