public class L5JPA06 {
    public static void main(String[] args) {
        System.out.printf("圓形面積為 : %f\n",calCircle(5, 3.1415926));
        System.out.printf("三角形面積為 : %f\n",calTriangle(10, 5));
        System.out.printf("長方形面積為 : %d\n",calRectangle(5, 10));
        System.out.printf("此圖形面積為 : %f",calCircle(5, 3.1415926)+calTriangle(10, 5)+calRectangle(5, 10));
    }
    static double calCircle(int r,double PI){
        return  r*r*PI;
    }
    static double calTriangle(int d,int h){
        return d*h/2;
    }
    static int calRectangle(int l,int w){
        return l*w;
    }
}
