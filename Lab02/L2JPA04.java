import java.util.Scanner;

public class L2JPA04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int i = sc.nextInt();
        sc.close();
        if(i%5==0 & i%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
