public class A_Bai08 {
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
        if (n == 0 || n == 1) {
            System.out.println(n + " khong co uoc la so nguyen to.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (checkSNT(i))) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");
        lietKeUocSNT(111);
    }
}
