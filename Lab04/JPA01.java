import java.util.Scanner;

public class JPA01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,s=0;
        double over=0;
        int[] arr = new int[10];
        System.out.println("請輸入10個整數:");
        for(i=0;i<10;i++){
            System.out.printf("第%d個整數:",i+1);
            n= sc.nextInt();
            if(n>60){
                s+=n;
                over++;
            }
            arr[i] = n;
        }
        sc.close();
        System.out.printf("陣列中大於60有%.0f",over);
        System.out.printf("%n總合為%d",s);
        System.out.printf("%n平均值為%f",s/over);

    }
}
