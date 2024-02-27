import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input: ");
        double kg = sc.nextInt();
        System.out.println(kg+" kg = "+(kg*2.20462)+"ponds");
        sc.close();
    }
}
