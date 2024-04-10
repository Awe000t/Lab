import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[3];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        sc.close();
        try (BufferedReader reader = new BufferedReader(new FileReader("read.txt"))){
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null  && index < 3) {
                String modifiedWord = modifyWord(line, num[index]);
                System.out.println(modifiedWord);
                index++;
            }
        }catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    static String modifyWord(String str, int n){
        if(str.length()<=n && n>0){
            return Integer.toString(n).repeat(n);
        }else{
            return Integer.toString(n).repeat(n) + str.substring(n);
        }
    }
}
