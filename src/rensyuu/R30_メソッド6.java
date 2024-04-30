package rensyuu;

import java.util.Scanner;

public class R30_メソッド6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.next();
		if (hasNameError(name)) {
		// 名前にエラーが存在した場合mainメソッドを終了する
		scan.close();
		return;
		}
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		if (hasAgeError(age)) {
		// 年齢にエラーが存在した場合mainメソッドを終了する
		scan.close();
		return;
		}
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();
	}
	
	static boolean hasNameError(String x){
		if(x.length()>20) {
			System.out.println("名前は20文字以内で入力してください");
			return true;
		}else if(x.equals("admin")) {
			System.out.println("利用できない名前です");
			return true;
		}else if(x.contains("㌔")){
			System.out.println("名前に禁止文字が含まれています");
			return true;
		}return false;
	}
	static boolean hasAgeError(int y){
		if(y<0 || y>130) {
			System.out.println("年齢は0以上130以下で入力してください");
			return true;
		}return false;
		
	}
}
