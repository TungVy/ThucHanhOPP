package Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
//  kiem nghiem bai 1:
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
        System.out.printf("%-5s%-25s%-15s%-15s%-15s \n","Id", "FullName", "TheoryMark", "PracticeMark", "AverageMark");
        sv1.printStudent();
        sv2.printStudent();
        sv3.printStudent();
    }
}