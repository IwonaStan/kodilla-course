public class LeapYear {
    public static void main (String[] args) {
        int thisYear = 2024;

        System.out.println("This is year:");
        System.out.println(thisYear);

        if(thisYear%4==0 && thisYear%100!=0)
            { System.out.println("This is leap year."); }
            else if(thisYear%4==0 && thisYear%100==0 && thisYear%400==0)
                { System.out.println("This is leap year."); }
                else { System.out.println ("This is not leap year.");}
        }
}
