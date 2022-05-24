public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three){
        if (((one > 12) && (one < 20)) || ((two > 12) && (two < 20)) || ((three > 12) && (three < 20))){
            System.out.println("true");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean isTeen(int a){
        if ((a > 12) && (a < 20)){
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }
}
