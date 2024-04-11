import java.util.Scanner;

public class JP {
    static String[] Keyboard = {
        "q","w","e","r","t","y","u","i","o","p",null,
        "a","s","d","f","g","h","j","k","l",null,
        "z","x","c","v","b","n","m",null}; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();
        sc.close();
        System.out.println(modifystring(str));
    }
    static String modifystring(String str){
        char ch;
        int index;
        StringBuilder result = new StringBuilder(str.length());
        for(int i= 0;i<str.length();i++){
            ch = str.charAt(i);
            index= findIndex(Keyboard, Character.toLowerCase(ch));
            if(Character.isUpperCase(ch) ){
                if(Keyboard[index+1] != null){
                    result.append(Keyboard[index+1].toUpperCase());
                }else{
                    result.append(Keyboard[index].toUpperCase());
                }
            }else if(Character.isLowerCase(ch) ){
                if(Keyboard[index+1] != null){
                    result.append(Keyboard[index+1]);
                }else{
                    result.append(Keyboard[index]);
                }
            }
        }
        return result.toString();
    }
    static int findIndex(String[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].charAt(0) == target) {
                return i;
            }
        }
        return -1;
    }   
}
