public class L4JPA06 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8};
        int a=0;
        for(int t: arr){
            if(t<=2){
                a = t*30;
            }else if(t<=4){
                a = (t-2)*50+60;
            }else if(t<=6){
                a = (t-4)*80+160;
            }else{
                a = (t-6)*100+320;
            }
            System.out.printf("停車時數 : %d小時",t);
            System.out.printf("\n應繳費用 : %d元整",a);
            System.out.println("\n--------------------");
        }
    }
}
