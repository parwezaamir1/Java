public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            System.out.println("Out of range");
            return false;
        }else if (year % 4 == 0 ){
            if (year % 100 == 0 ){
                if (year % 400 == 0){
                    System.out.println(year + " is leap year");
                    return true;
                }else {
                    System.out.println(year + " is not  leap year");
                    return  false;
                }
            }else {
                System.out.println(year + " is leap year");
                return true;
            }
        }else {
            System.out.println(year + " is not leap year");
            return false;
        }
    }
}
