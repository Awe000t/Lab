import java.util.Scanner;

public class L2JPA06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        int pass=0;
        String[] subject={"Chinese","English","Math"};
        System.out.print("Input Chinese score:");
        score[0] = sc.nextInt();
        System.out.print("Input English score:");
        score[1] = sc.nextInt();
        System.out.print("Input Math score:");
        score[2] = sc.nextInt();
        sc.close();
        for(int i=0;i<3;i++){
            if(score[i]<60){
                System.out.printf("%s failed.%n",subject[i]);
            }else{
                pass+=1;
            }
        }
        if(pass==3){
            System.out.println("All pass.");
        }
    }
}
