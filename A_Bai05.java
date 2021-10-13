/**
 * A_Bai05
 */
public class A_Bai05 {

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        for (int k = 1000; k < 2000; ++k) {
            if (k % 3 == 0 && k % 5 == 0 && k % 7 == 0)
                System.out.println(k);
        }
    }
}