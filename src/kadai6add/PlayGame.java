package kadai6add;

import java.util.Scanner;

public class PlayGame {
	private static Human[] partyList;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===パーティを作成します===");
		//Human[] partyList = new Warrior[3];
		partyList =new Human[3];

		for (int i = 0; i < partyList.length; i++) {
			System.out.println("どちら(1.市民 2.戦士)を作成しますか:");
			int b = scan.nextInt();
//			Human h1 =new Warrior();
//			Warrior h = (Warrior)h1;
			
			if (b == 1) {
				System.out.println("名前:");
				String c = scan.next();
				partyList[i]  = new Human(c);
				
			}
			if (b == 2) {
				System.out.println("名前:");
				String d = scan.next();
				System.out.println("種別:");
				String e = scan.next();
				partyList[i] = new Warrior(e, d);
			}
			
		}
		System.out.println("===パーティを作成しました===");
		int f;

		do {
			System.out.println("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			f = scan.nextInt();

			if (f == 1) {
				itiran(partyList);

			}
			if (f == 2) {
				kougeki(partyList);
			
			}

		} while (f != 9);

	}

	static void itiran(Human[] partyList) {
		for (Human customer : partyList) {
			customer.info();
		}
	}
	static void kougeki(Human[] partyList) {
		for (Human customer : partyList) {
			customer.attack();
		}
	
	
	}

}
