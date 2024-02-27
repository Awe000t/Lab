

public class JPA07 {
    public static void main(String[] args) {
        int action = 1, skill = 2, teamgame = 3; 
        System.out.println("The basketball grade is "+sgrade.calgrade(action,skill,teamgame));
        System.out.print("The baseball grade is "+sgrade.calgrade(skill,teamgame));
    }
    public class sgrade {
        public static int calgrade(int action,int skill,int teamgame) {
            return  action + skill + teamgame;
        }
        public static int calgrade(int skill,int teamgame) {
            return 10 + skill + teamgame;
        }
    }
}
