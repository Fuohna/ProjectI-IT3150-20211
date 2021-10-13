public class A_Bai06 {
    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        int count = 1;
        for (int k = 1; count < 6; k++) {
            long candidate = (1L << (k - 1)) * ((1L << k) - 1);
            if (isPerfectNumber(candidate)) {
                count++;
                System.out.println(candidate);
            }
        }
    }

    private static boolean isPerfectNumber(long n) {
        if (n < 2)
            return false;
        long sum = 1;
        long sqrt = (long) Math.sqrt(n);
        for (long div = 2; div <= sqrt; div++) {
            if (n % div == 0) {
                sum += div + n / div;
                if (sum > n)
                    return false;
            }
        }
        return n == sum;
    }
}
