import java.util.Scanner;

public class A_Bai12 {
    static int hight;

    private static void inXuoi() {
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void inNguoc() {
        for (int i = hight; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        Scanner sc = new Scanner(System.in);
        System.out.print("h = ");
        hight = sc.nextInt();
        System.out.println("Enter the number before the print selection:\n1.In xuoi\n2.In nguoc\n");
        int res = sc.nextInt();
        switch(res){
            case 1: inXuoi(); break;
            case 2: inNguoc(); break;
            default: break;
        }
        sc.close();
    }
}
