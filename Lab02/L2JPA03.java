import java.util.Scanner;

public class L2JPA03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer:");
        int i = sc.nextInt();
        sc.close();
        if(i%2==0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}
