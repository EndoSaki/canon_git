package kadai2addに;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		int kaisu = scan.nextInt();
		
		String a="";
		
		for(int i = 0;i< kaisu;i++) {
			System.out.print((i+1)+"つ目の文字列を入力してください：");
			String moji = scan.next();
			a +=moji;
			System.out.println(a);

	}

}
}
