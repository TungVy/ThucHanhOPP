package Week1;

//Bai 1:
public class Coordinates {

//  cac thuoc tinh: toa do x, toa do y va ten toa do.
    private int x;
    private int y;
    private String nameCoor;
//  khoi tao mot constructor mac dinh.
    public Coordinates() {
    }

//  khoi tao mot constructor day du tham so.
    public Coordinates(int x, int y, String nameCoor) {
        this.x = x;
        this.y = y;
        this.nameCoor = nameCoor;
    }

//  Phuong thuc toString tra ve thong tin theo mau.
    @Override
    public String toString() {
        return nameCoor+"("+x+","+y+")";
    }

    //  phuong thuc thiet lap get, set
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
