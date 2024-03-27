public class L4JPA04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = 0, sec = 1, temp=0;
        arr[0]= 0; arr[1]= 1;
        for (int i=2;i<10;i++){
            temp = first + sec;
            first = sec;
            sec = temp;
            arr[i] = temp;
        }
        for(int x : arr){
            System.out.println(x);
        }
    }
}
