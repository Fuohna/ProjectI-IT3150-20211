import java.util.Scanner;

/**
 * A_Bai02
 */
public class A_Bai02 {

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        int remark = 0, numL = 0, numF = 0, cnt = 0;
        Scanner sc = new Scanner(System.in);
        numF = sc.nextInt();
        numL = sc.nextInt();
        for (int i = numF; i < numL; ++i) {
            remark = 0;
            for (int k = 2; k <= i / 2; ++k) {
                if (i % k == 0) {
                    remark++;
                    break;
                }
            }
            if (i>1 && remark == 0 && cnt < 21) {
                cnt++;
                System.out.println(i);
            }
        }
        sc.close();
    }
}
