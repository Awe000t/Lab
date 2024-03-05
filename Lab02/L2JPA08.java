import java.util.Scanner;
public class L2JPA08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int grade = sc.nextInt();
        sc.close();
        if(grade>=90){
            System.out.println("Your grade is A");
        }else if(grade>=80){
            System.out.println("Your grade is B");
        }else if(grade>=70){
            System.out.println("Your grade is C");
        }else if(grade>=60){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }
    }
}
