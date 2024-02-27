import java.util.Scanner;
public class JPA03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input:");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        System.out.printf("Average: %.2f",(i1+i2+i3)/3.0);
        sc.close();
    }
}