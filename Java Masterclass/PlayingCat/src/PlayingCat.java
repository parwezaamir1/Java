public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true,10);
        isCatPlaying(false,36);
        isCatPlaying(false,35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((summer == false) && (temperature >= 25) && (temperature <=35)){
            System.out.println("true");
            return true;
        }else if ((summer == true) && ((temperature >= 25) && (temperature <=45))){
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }
}
