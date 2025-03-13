public class Leap2020{
    public static void main(String[] args) {
        int startYear = 2010;
        int endYear = 2020;

        System.out.println("Leap years between " + startYear + " and " + endYear + " are:");

               for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
