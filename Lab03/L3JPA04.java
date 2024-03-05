import java.util.Scanner;

public class L3JPA04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d=0f,s=0f;
        int t=0;
        while(true){
            System.out.print("Please enter meal dollars or -1 to stop: ");
            d = sc.nextInt();
            if(d==-1){
                break;
            }
            s+=d;
            t+=1;
        }
        sc.close();
        System.out.println("餐點總費用: "+s);
        System.out.printf("%d 道平均費用為:%.2f",t,s/t);
    }
}
