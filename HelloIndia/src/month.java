public class month {

//    Write down a code to print a month number from a month name for first 3 months - January, February & March. For any other inputs, display 0;
//
//    Sample Input:
//
//    String name = "March";
//
//    Sample Output:
//
//            3
//    Sample Input:
//
//    String name = "April";
//
//    Sample Output:
//
//            0
//
//    Questions for this assignment
//    Write your code using "switch" statement.

    public static void main(String[] args) {
        String name = "march";
        int monthNum = getMonthNum(name);
        System.out.println(monthNum);
    }

    public static int getMonthNum(String monthName) {
        int monthNum = 0;
        switch (monthName.toLowerCase()){
            case "march":
                monthNum = 1;
                break;
            case "April":
                monthNum = 2;
                break;
            case "May":
                monthNum = 3;
                break;
            default:
                monthNum = 0;
                break;
        }
        return  monthNum;
    }
}
