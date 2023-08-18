public class tickets {
    public static void main(String[] args) {
//        Write a code to find a movie ticket price from following age range:
//
//        Children (ages less than 13): $5
//        Adults (ages 13 & up): $8
//        Seniors (ages 60 & up): $7
//        Sample Input:
//
//        int age = 34;
//
//        Sample Output:
//        $8
//
//        Questions for this assignment
//        Which selection statement is applicable here - if or switch?
//
//        Write you solution here.


        int age = 34;
        if( age  < 13){
            System.out.println("$5");
        } else if (13 <= age ) {
            System.out.println("$8");
        }else if (60 >= age){
            System.out.println("$7");
        }



    }
}
