package week4_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D_Bai15 {
	public static void main(String[] args)throws Exception{
        BufferedReader Nhap=new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Enter S1 = ");
        String S1= Nhap.readLine();
        System.out.print("Enter S2 = ");
        String S2= Nhap.readLine();
    
        String S3=new String();
        // tach xau S2 co bien n
        int n=S2.length(); // do dai cua S2
        int k;
        if(n%2==0){
            k=n/2;
        }
        else k=(n+1)/2;
        S3=S2.substring(0,k);
        S3=S3+S1;
        S3=S3+S2.substring(k);
        System.out.println(S3);
    }
}
