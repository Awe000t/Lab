import java.util.Scanner;
public class JPA04 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("輸入第1組的x和y座標:");
          double x1 = sc.nextInt();
          double y1 = sc.nextInt();
          System.out.print("輸入第2組的x和y座標:");
          double x2 = sc.nextInt();
          double y2 = sc.nextInt();
          double leng = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
          System.out.printf("介於<%.2f,%.2f>和<%.2f,%.2f>之間的距離是%.2f",x1,y1,x2,y2,leng);
          sc.close();
     }
}
