import java.util.Scanner;

public class L2JPA07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入三個整數:");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int pre,sum=t1+t2+t3;
        pre = t1;
        t1 = Math.min(t1,Math.min(t2,t3));
        t3 = Math.max(pre,Math.max(t2,t3));
        t2 = sum-t1-t3;
        if(t1>0){
            if((t1+t2)>t3){
                if(Math.pow(t1,2)+Math.pow(t2,2) == Math.pow(t3,2)){
                    System.out.println("直角三角形");
                }else if(Math.pow(t1,2)+Math.pow(t2,2) < Math.pow(t3,2)){
                    System.out.println("鈍角三角形");
                }else if(Math.pow(t1,2)+Math.pow(t2,2) > Math.pow(t3,2)){
                    System.out.println("銳角三角形");
                }
            }else{
                System.out.println("不可以構成三角形");   
            }
        }
        sc.close();
    }
}
