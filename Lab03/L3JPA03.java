public class L3JPA03 {
    public static void main(String[] args) {
        int t=4,s=0;
        System.out.print("1~1000中的完美數有:");
        while(t<=1000){
            s=0;
            for(int i = 2;i<t/2;i++){
                if(t%i==0){
                    s+=i;
                }
            }
            if(s+1==t/2){
                System.out.print(" "+t);
            }
            t+=2;
            
        }
    }
}
