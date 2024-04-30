package p12;

public class Mobile extends Camera {
	private String telNo;//電話番号
	
	//コンストラクタ
	public Mobile() {
	//	super(3);
		super();
		System.out.println("Mobileコンストラクタ");
	}
	public Mobile(String telNo,String maker) {
		//	super(3);
			super();
			System.out.println("Mobileコンストラクタ");
		}
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	//メソッド
	public void talk() {
		System.out.println("電話番号:"+ telNo);
		System.out.println("話し中です！");
	}
}
