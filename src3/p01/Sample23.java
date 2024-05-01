package p01;

import java.util.Scanner;

public class Sample23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String moji;
		
		do {
			System.out.print("文字を入力してください:");
			moji = scan.next();
			
			System.out.print(moji);
		} while(moji.equals("zzz") == false);//(!moji.equals("zzz"))
			
		}
	}
