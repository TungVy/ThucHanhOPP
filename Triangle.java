package Week1;

import java.lang.Math;

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

//      phuong thuc tinh chu vi
    public float calPerimeter() {
        return this.ma+this.mb+this.mc;
    }


//    phuong tinh dien tich
    public double calSuperficiality() {
        float p = (ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
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
