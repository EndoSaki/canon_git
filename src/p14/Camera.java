package p14;

public class Camera {
	private String maker;//メーカー
	
	//コンストラクタ
		public Camera() {
			
		}
		public Camera(String maker) {
			this.maker = maker;
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
