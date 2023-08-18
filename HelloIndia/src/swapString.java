 class SwapString {

    public static void swapStrings(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        String a = "Java";
        String b = "Udemy";

        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        swapStrings(a,b);
//        String temp = a;
//        a = b;
//        b = temp;

        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
