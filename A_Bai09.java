public class A_Bai09 {
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

    public static void phanTich(int n) {
        if (n > 1) {
            System.out.print(n + "=");
            for (int i = 2; i <= n; i++)
                while (n % i == 0 && checkSNT(i)) {
                    if (n / i == 1) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + ".");
                    }
                    n /= i;
                }
        } else{
            System.out.println("So n khong thoa man dieu kien n>1");
        }
    }

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");
        phanTich(12);
    }
}
