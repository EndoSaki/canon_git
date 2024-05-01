package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b = a();
		
		System.out.println(b);
		
		//System.out.print("数字を入力してください：");
		int c = 0;// = scan.nextInt();
		
		int count =0;
		 do{
			count++;
			System.out.println("数字を入力してください：");
			 c = scan.nextInt();
			 
		}while(kazu(b, c));
		
		scan.close();
		System.out.println("大当たりです");
		System.out.println(count+"回で当たりました！");		

	}
	static int a() {
		return new Random().nextInt(100);
		
		
	}
	static boolean kazu(int b, int x) {
		//int b =a();
		
		if( b < x) {
			System.out.println("**大きすぎです**");
			return true;
			
		}else if(b > x){
			System.out.println("**小さすぎです**");
			return true;
			
		}else {
			return false;
		
		}
		
	}

}
