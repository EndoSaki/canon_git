package p01;

public class Sample14 {	
	public static void main(String[] args) {
		String date = "小川";
		
		//switch文
		switch(date) {
		case "小川":
			System.out.println("1です");
			break;
		case "田中":
			System.out.println("2です");
			break;
		case "工藤":
			System.out.println("3です");
			break;
		default:
			System.out.println("該当なし");
			break;
		}
	}
}


