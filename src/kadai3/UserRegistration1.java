package kadai3;

import java.util.Scanner;

public class UserRegistration1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.next();
		// 名前が20文字より大きい場合エラー
		// 名前が「admin」に一致する場合エラー
		// 名前に禁止文字「㌔」が含まれている場合エラー
		
		
		
		if(name.length()>=20) {
			System.out.print("名前は20文字以内で入力してください");
		}else if(name.equals("admin")) {
			System.out.print("利用できない名前です");
		}if(name.contains("㌔")) {
			System.out.print("名前に禁止文字が含まれています");
		}else {
			System.out.print("年齢を入力してください：");
		}
		int age = scan.nextInt();
		
		// 年齢が0未満、または、130より大きい場合エラー
		if(age <0 || age >130) {
			System.out.print("年齢は0以上130以下で入力してください");
		}
		System.out.println("名前：" + name + "、年齢：" + age +"で登録しました");
		scan.close();

	}
	

}
