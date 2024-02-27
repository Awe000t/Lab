import java.util.Scanner;
public class JPA05 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("請輸入你的姓名:");
          String name = sc.nextLine();
          System.out.printf("Hi, %s,請輸入您的銅板個數:",name);
          System.out.print("請輸入1元的數量:");
          int one = sc.nextInt();
          System.out.print("請輸入5元的數量:");
          int five = sc.nextInt();
          System.out.print("請輸入10元的數量:");
          int ten = sc.nextInt();
          System.out.print("請輸入50元的數量:");
          int fifty = sc.nextInt();
          int sum = one*1+five*5+ten*10+fifty*50;
          System.out.printf("你的錢總共有:%d 千 %d 百 %d 十 %d 元",(sum/1000)%10,(sum/100)%10,(sum/10)%10,sum%10);
          sc.close();
     }
}