package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = a();
		int b = b();
		int c = c();
		
		System.out.println(a+""+b+""+c);
		
		//System.out.print("数字を入力してください：");
		//int c = 0;// = scan.nextInt();
		
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
		return new Random().nextInt(9)+1;
		
		
	}
	static int b() {
		int a =a();
		int b ;
		
		do { 
			Random rand = new Random(9);
			 b=rand. nextInt(10);
		}while(b !=a);
		return b;
		
	}
	static int c() {
		int a =a();
		int b =b();
		int c;
		
		do { 
			Random rand = new Random();
			 c=rand. nextInt(10);
		}while(c !=a  && c != b);
		return c;
		
		
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
