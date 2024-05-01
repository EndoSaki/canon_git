package rensyuu;

import java.util.Scanner;

public class R30_メソッド5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.next();
		int a =name.length();
		if(a>20) {
			System.out.println("名前は20文字以内で入力してください");
			return;
		}else if(name.equals("admin")) {
			System.out.println("利用できない名前です");
			return;
		}else if(name.contains("㌔")){
			System.out.println("名前に禁止文字が含まれています");
			return;
		}
		
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		// 年齢が0未満、または、130より大きい場合エラー
		if(age<0 || age>130) {
			System.out.println("年齢は0以上130以下で入力してください");
			return;
		}
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();
	}
	
	

}
