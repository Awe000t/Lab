import java.util.Scanner;

public class L3JPA07 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Input:");
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m==999){
                break;
            }
            System.out.println(compute.xx(m, n));
        }
        sc.close();
    }
    public class compute{
        public static int xx(int m,int n){
            int l = 0;
            l = Math.min(m,n);
            while(l>0){
                if (m%l==0 & n%l==0){
                    break;
                }
                l--;
            }
            return l;            
        }
    }
}
