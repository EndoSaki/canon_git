package Loop1;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("	情報を登録します");
	
		
		System.out.print("名前：");
		String num1 = scan.next();
		System.out.print("趣味1:");
		String num2 = scan.next();
		System.out.print("趣味2:");
		String num3 = scan.next();
		System.out.print("趣味3:");
		String num4 = scan.next();
		String[] canon = new String[] {num2,num3,num4};
		
		
		System.out.println("こんにちは"+ num1+"です");
		System.out.println("私の趣味は");
		System.out.println("・"+ canon[0]);
		System.out.println("・"+canon[1]);
		System.out.println("・"+canon[2]);
		System.out.println("です");
		

	}

}
