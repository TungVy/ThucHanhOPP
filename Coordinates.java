package Tuan1Bai1;

public class Coordinates {

	//Các thuộc tính: tọa độ x, tọa độ y và tên tọa độ.
	private int x;
	private int y;
	private String nameCoor;
	
	//một constructor mặc định 
	public Coordinates() {
	
	}
	
	//một constructor đầy đủ tham số
	public Coordinates(int x, int y, String nameCoor) {
		this.x = x;
		this.y = y;
		this.nameCoor = nameCoor;
	}
	
	//Các phương thức thiết lập (set), lấy (get) thông tin x, y và tên tọa độ.
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getNameCoor() {
		return nameCoor;
	}
	public void setNameCoor(String nameCoor) {
		this.nameCoor = nameCoor;
	}
	
	

	}

}
