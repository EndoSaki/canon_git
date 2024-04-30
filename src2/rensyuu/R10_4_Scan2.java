package rensyuu;

import java.util.Scanner;

public class R10_4_Scan2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("数字を入力してください:");
		int a = scan.nextInt();
		
		if(a %2 == 0 && a>0) {
			System.out.println(a+"は正の偶数です");
		}else  if(a %2 == 1 && a>0){
			System.out.println(a+"は正の奇数です");
		}else  if(a %2 == 0 && a<0){
			System.out.println(a+"は負の偶数です");
		}else {
			System.out.println(a+"は負の奇数です");
		}

	}

}
