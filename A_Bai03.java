/**
 * A_Bai03
 */
public class A_Bai03 {

    public static void main(String[] args) {

        System.out.println("20183680 LePhuongAnh");

        int remark = 0;

        for (int i = 1000; i < 2001; ++i) {
            remark = 0;
            for (int k = 2; k <= i / 2; ++k) {
                if (i % k == 0) {
                    remark++;
                    break;
                }
            }
            if (remark == 0) {
                System.out.print(i + " ");
            }
        }

    }
}