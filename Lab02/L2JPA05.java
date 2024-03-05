import java.util.Scanner;

public class L2JPA05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = sc.nextInt();
        sc.close();
        if(i%6==0){
            System.out.printf("%d是2、3、6的倍數",i);
        }else if(i%2==0){
            System.out.printf("%d是2的倍數",i);
        }else if(i%3==0){
            System.out.printf("%d是3的倍數",i);
        }else{
            System.out.printf("%d不是2、3、6的倍數",i);
        }
    }
}
