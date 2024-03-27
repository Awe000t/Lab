public class L4JPA05 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E","F","G","H","I","J"} ;
        System.out.print("反轉陣列資料之前: ");
        for(String x : arr){
            System.out.print(x+ " ");
        }
        System.out.print("\n");
        System.out.print("反轉陣列資料之後: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
