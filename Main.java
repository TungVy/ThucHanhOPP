package Week1;

public class Main {
    public static void main(String args[]) {
//  kiem nghiem bai 1:
        Coordinates a = new Coordinates(5, 6, "A");
        Coordinates b = new Coordinates(1, 8, "B");

        System.out.println(a);
        System.out.println(b);

//  kiem nghiem bai 2:
        Student sv1 = new Student(1, "Nguyen Thi Tung Vy", -9, 4);
        Student sv2 = new Student(2, "Tung Vy", 7, 11);

        
        System.out.printf("%-5s%-25s%-15s%-15s%-15s \n","Id", "FullName", "TheoryMark", "PracticeMark", "AverageMark");
        sv1.printStudent();
        sv2.printStudent();

    }
}