package p01;

public class Sample12 {	
	public static void main(String[] args) {
		short date = 3;
		
		//switch文
		switch(date) {
		case 1:
			System.out.println("1です");
			break;
		case 2:
			System.out.println("2です");
			break;
		case 3:
			System.out.println("3です");
			break;
		default:
			System.out.println("該当なし");
			break;
		}
		
		//if文
		if(date == 1) {
			System.out.println("1です");
		}else if(date == 2) {
			System.out.println("2です");
		}else if(date == 3) {
			System.out.println("3です");
		}else {
			System.out.println("該当なし");
		}
		
		
	}

}
