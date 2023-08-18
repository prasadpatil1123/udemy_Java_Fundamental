public class pumpkin {
    public static void main(String[] args) {
//        Write a code that will find and print the largest integer from an integer array:
//
//        Sample Input:
//
//        int weight[] = { 6, 3, 2, 5, 6, 8, 7, 1 };
//
//        Sample Output:
//
//        8
//
//        Hint: Create an integer variable to hold current largest number by comparing with each weight.
//
//
//        Questions for this assignment
//        Solve the problem with a For loop.

        int weight[] = { 6, 3, 2, 5, 6, 8, 7, 1 };
        int max = weight[0] ;
        for (int i =1; i < weight.length; i++){

           if( weight[i] > max ){
               max = weight[i];
           }

        }
        System.out.println(max);

    }
}
