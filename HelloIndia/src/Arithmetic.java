public class Arithmetic {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

//        x++;
//        System.out.println(x);
//        ++x;
//        System.out.println(x);
//
//        y = ++x;
//        System.out.println(x);
//        System.out.println(y);
//
//        y = x++;
//        System.out.println(x);
//        System.out.println(y);

        x = x+ 10;
        System.out.println(x); // 15
        x += 10;
        System.out.println(x); // 25

        x -= 10;
        System.out.println(x);

        x *= 10;        System.out.println(x);
        x /= 10;         System.out.println(x);

    }
}
