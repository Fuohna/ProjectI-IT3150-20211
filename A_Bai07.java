public class A_Bai07 {
    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");

        int cnt0=0, cnt1=0, cnt2=0, cnt3=0;
        for(int i=0; i <= 100; ++i){
            if(i%5 == 0) cnt0++;
            if(i%5 == 1) cnt1++;
            if(i%5 == 2) cnt2++;
            if(i%5 == 3) cnt3++; 
        }
        System.out.println("a. "+ cnt0);
        System.out.println("b. "+ cnt1);
        System.out.println("c. "+ cnt2);
        System.out.println("d. "+ cnt3);
    }
}
