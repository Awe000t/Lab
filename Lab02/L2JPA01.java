import java.util.Scanner;
public class L2JPA01 {
    public static void main(String[] args) {
        System.out.println("Please enter score:");
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();
        sc.close();
        if(Score>=60){
            System.out.println("you pass");
        }
        System.out.println("End");
    }
}
