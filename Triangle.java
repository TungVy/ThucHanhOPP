package Week1;

import java.lang.Math;

public class Triangle {
//    khoi tao bien
    private int ma;
    private int mb;
    private int mc;

//    Contructor mac dinh
    public Triangle() {
    }

    //    Constructor du tham so
    public Triangle(int ma, int mb, int mc) {
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

//    phuong thuc nhan dang tam giac
    public void checkTriangle() {
         if (ma >= mb+mc || mb >= ma+mc || mc >= ma+mb) {
             System.out.println("- Khong phai tam giac!!");
        }
        else {
             if (ma == mb && ma == mc) {
                 System.out.println("- Tam giac deu!!");
             } else if (ma == mb || ma == mc || mb == mc) {
                 System.out.println("- Tam giac can!!");
             } else {
                 System.out.println("- Tam giac thuong!!");
             }
         }
    }

//    getter, setter

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma < 0) {
            this.ma = 0;
        }
        else {
            this.ma = ma;
        }
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb < 0){
            this.mb = 0;
        }
        else {
            this.mb = mb;
        }
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc < 0){
            this.mc = 0;
        }
        else {
            this.mc = mc;
        }
    }
}
