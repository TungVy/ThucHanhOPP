package Week1;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) throws Exception {
/*//  kiem nghiem bai 1:
        System.out.println("___Bai 1:");

        Coordinates a = new Coordinates(5, 6, "A");
        Coordinates b = new Coordinates(1, 8, "B");

        System.out.println(a);
        System.out.println(b);

//  kiem nghiem bai 2:
        System.out.println("\n___Bai 2:");

        // Tao du lieu sv1, sv2
        Student sv1 = new Student(1, "Nguyen Thi Tung Vy", -9, 4);
        Student sv2 = new Student(2, "Tung Vy", 7, 11);

        // Tao du lieu sv3 bang cach nhap tu ban phim
        Scanner input = new Scanner(System.in);
        Student sv3 = new Student();
        System.out.print("- Nhap id: ");
        sv3.setId(input.nextInt());
        input.nextLine();
        System.out.print("- Nhap ho va ten: ");
        sv3.setFullName(input.nextLine());
        System.out.print("- Nhap diem li thuyet: ");
        sv3.setTheoryMark(input.nextFloat());
        System.out.print("- Nhap diem thuc hanh: ");
        sv3.setPracticeMark(input.nextFloat());

        // In danh sach sinh vien
        System.out.println("\n");
        System.out.printf("%-5s%-25s%-15s%-15s%-15s \n", "Id", "FullName", "TheoryMark", "PracticeMark", "AverageMark");
        sv1.printStudent();
        sv2.printStudent();
        sv3.printStudent();

//        kiem nghiem bai 3:
        System.out.println("\n___Bai 3:");

    //        tao du lieu tam giac
        Triangle t1 = new Triangle(0, 0, 0);
        Triangle t2 = new Triangle(1, 1, 3);
        Triangle t3 = new Triangle(2, 3, 4);
        Triangle t4 = new Triangle(5, 5, 3);
        Triangle t5 = new Triangle(6, 6, 6);

    //        xuat thong tin tam giac
        System.out.printf("%-10s%-10s%-10s%-25s%-10s%-10s\n", "Canh a", "Canh b", "Canh c", "Loai tam giac", "Chu vi", "Dien tich");
        t1.printTriangle();
        t2.printTriangle();
        t3.printTriangle();
        t4.printTriangle();
        t5.printTriangle();
*/
//        kiem nghiem bai 4:
        System.out.println("\n___Bai4:");

    //        tao du lieu xe
        Vehicle xe1 = new Vehicle("Tung Vy", "Future Neo", 100, 35000000);
        Vehicle xe2 = new Vehicle("Gia Nhi", "Ford Ranger", 3000, 250000000);
        Vehicle xe3 = new Vehicle("Bang Di", "Landscape", 1500, 1000000000);

    //        xuat bang ke khai tien thue cua xe
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        xe1.printVehicle();
        xe2.printVehicle();
        xe3.printVehicle();

//        kiem nghiem bai 5:
        System.out.println("\n___Bai5:");

        // tao du lieu HangThucPham
        HangThucPham h1 = new HangThucPham("001", "Gao", 100000, LocalDate.of(2023, 7, 10), LocalDate.of(2023, 7, 10));
        HangThucPham h2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2023, 3, 1), LocalDate.of(2023, 9, 1));
        HangThucPham h3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2022, 3, 1), LocalDate.of(2023, 3, 1));

        // xuat thong tin HangThucPham
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}