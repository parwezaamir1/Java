public class Main {
    public static void main(String[] args) {
        double milesPerHour = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(milesPerHour);

        SpeedConverter.printConversion(10.5);
    }
}
