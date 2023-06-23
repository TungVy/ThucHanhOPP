package Week1;

import java.time.LocalDate;

public class HangThucPham {

//    khoi tao bien
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

//    constructor mac dinh
    public HangThucPham() {
    }

//    constructor day du tham so
    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

//    getter, setter
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals("")) {
            this.maHang = maHang;
        }
        else {
            throw new Exception("Loi: Ma hang rong!");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == "") {
            this.tenHang = "xxx";
        }
        else {
            this.maHang = maHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia < 0) {
            this.donGia = 0;
        }
        else {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now())){
            this.ngaySanXuat = ngaySanXuat;
        }
        else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isAfter(ngaySanXuat)){
            this.ngayHetHan = ngayHetHan;
        }
        else {
            this.ngayHetHan = ngaySanXuat;
        }
    }
}
