import java.util.Scanner;
public class L2JPA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        sc.close();
        System.out.printf("%d is larger than %d",Math.max(i1,i2),Math.min(i1,i2));
        
    }
}
