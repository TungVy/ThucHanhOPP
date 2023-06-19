package Week1;

public class Triangle {
//    khoi tao bien
    private float ma;
    private float mb;
    private float mc;

//    Contructor mac dinh
    public Triangle() {
    }

    //    Constructor du tham so
    public Triangle(float ma, float mb, float mc) {
        if (ma<0 || mb<0 || mc<0) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
        else if (ma >= mb+mc || mb >= ma+mc || mc >= ma+mb) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
        else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

//    getter, setter

    public float getMa() {
        return ma;
    }

    public void setMa(float ma) {
        if (ma < 0) {
            this.ma = 0;
        }
        else {
            this.ma = ma;
        }
    }

    public float getMb() {
        return mb;
    }

    public void setMb(float mb) {
        if (mb < 0){
            this.mb = 0;
        }
        else {
            this.mb = mb;
        }
    }

    public float getMc() {
        return mc;
    }

    public void setMc(float mc) {
        if (mc < 0){
            this.mc = 0;
        }
        else {
            this.mc = mc;
        }
    }
}
