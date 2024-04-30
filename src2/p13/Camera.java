package p13;

public class Camera {
	protected String maker;//メーカー
	
	//コンストラクタ
		public Camera(int a) {
			
		}
		public Camera() {
			
		}
	
	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	//メソッド
	public void takePicture() {
		System.out.println("メーカー:"+ maker);
		System.out.println("写真撮影中です！");
	}
}
