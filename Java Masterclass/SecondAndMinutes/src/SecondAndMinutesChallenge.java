class SecondAndMinutes {

    public static String getDurationString(long minutes, long seconds){
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))){
            System.out.println("Invalid Value");
            return "Invalid Value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " h " + remainingMinutes +" m " + seconds + " s ";

    }
    public static String getDurationString(long seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,seconds);
    }
}
