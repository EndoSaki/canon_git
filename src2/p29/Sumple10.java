package p29;

public class Sumple10 {
	

		public static void main(String[] args) {
			
			
		try {
			throw new NumberFormatException("エラー");
		}catch(Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	}
}
