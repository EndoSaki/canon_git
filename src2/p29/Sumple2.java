package p29;

public class Sumple2 {
	

		public static void main(String[] args) {
			
			String s = "ABCDEF";			
			
			System.out.println(s);
			System.out.println(s.length());//文字の長さ
			System.out.println(s.charAt(2));//2号室の文字7
			System.out.println(s.substring(3));//３号室以降
			System.out.println(s.substring(2,5));//３～4号室の表示
			System.out.println(s.indexOf("C"));//部屋番号の確認
			System.out.println(s.indexOf("W"));//部屋番号の確認
			System.out.println(s.lastIndexOf("C"));//部屋番号の確認
			System.out.println(s.startsWith("ABC"));//指定した文字で始まるか確認
			System.out.println(s.startsWith("xyz"));//指定した文字で始まるか確認
			System.out.println(s.endsWith("EF"));//指定した文字で終わってるか確認
			System.out.println(s.endsWith("xyz"));//指定した文字で終わってるか確認
			
			System.out.println(s.startsWith("DEF",3));//指定した文字で終わってるか確認
			System.out.println(s.startsWith("DEF",2));//指定した文字で終わってるか確認

	}
}
