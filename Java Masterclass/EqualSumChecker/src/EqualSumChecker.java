public class EqualSumChecker {
    public static boolean hasEqualSum(int one, int two, int three){
        if ((one + two) == (three)){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
}
