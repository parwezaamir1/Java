public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Zinnat", 500);
        System.out.println(" new score is "+ newScore );
        calculateScore(100);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName+ " score "+ score +" points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player unnamed score "+ score +" points");
        return score * 1000;
    }

}
