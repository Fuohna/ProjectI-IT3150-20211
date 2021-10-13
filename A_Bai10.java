public class A_Bai10 {
    public static boolean checkSNT(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }

    public static void lietKeUocSNT(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && (checkSNT(i))) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        lietKeUocSNT(20);
    }
}
