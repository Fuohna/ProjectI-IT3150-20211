import java.util.Random;

public class A_Bai11 {
    private static Random random = new Random();

    public static int[] arrRandom(int mem){
        int a[] = new int[mem];
        for(int i=0; i<mem; i++){
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        return a;
    }
    public static void shuffle(int arr[]) {
        System.out.println();

        int count = arr.length;
        for (int i = count; i > 1; i--) {
            swap(arr, i - 1, random.nextInt(i));
        }
        
        for(int i = 0; i< count; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println("20183680 LePhuongAnh");
        shuffle(arrRandom(10));
    }
}
