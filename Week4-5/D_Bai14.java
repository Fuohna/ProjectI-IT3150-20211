package week4_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D_Bai14 {
	public static void main(String[] args)throws Exception{
        BufferedReader Nhap=new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Enter S = ");
        String S1= Nhap.readLine();
        
        String S2 = new String();
        for(int i = 0; i < S1.length(); i++) {
        	S2 = S1.substring(i, S1.length());
        	S2 = S2+S1.substring(0, i);
        	System.out.println("S_"+i+ " = "+S2 );
        }
    }
}
