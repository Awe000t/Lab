public class L4JPA03 {
    public static void main(String[] args) {
        System.out.println("陣列A的內容為(3x3)\n 1  2  3\n 4  5  6");
        int A[][] ={{1,2,3},{4,5,6}};

        System.out.println("陣列B的內容為(3x3)\n 7  8  9\n10 11 12");
        int B[][] ={{7,8,9},{10,11,12}};
        System.out.println("陣列A+B=C 陣列C的內容為(3x3)");
        plus(A,B);
    }
    public static int plus(int A[][],int B[][]){
        for(int i=0;i<2;i++){
            for(int t=0;t<3;t++){
                System.out.printf("%2d ",A[i][t]+B[i][t]);
            }
            System.out.print("\n");
        }
        
        return 0;
    
        
    }
}
