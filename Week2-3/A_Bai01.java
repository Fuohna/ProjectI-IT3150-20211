/**
 * A_Bai01:
 */
public class A_Bai01 {

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");
        for(int i=1; i < 100; ++i){
            compositeNum(i);
        }
    }

    public static void compositeNum(int n) {
        int flag = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                flag = i;
            }
        }
        if (flag > 1) {
            System.out.print(n + " ");
        }
    }
}
