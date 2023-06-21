package Week1;

public class Student {

//    khoi tao bien
    private int id;
    private String fullName;
    private float theoryMark;
    private float practiceMark;

//    Constructor mac dinh
    public Student() {
    }

    //    Conatructor day du tham so
    public Student(int id, String fullName, float theoryMark, float practiceMark) {
        if (id < 0){
            this.id = 0;
            System.out.println("Wrong!!");
        }
        else{
            this.id = id;
        }
        if (fullName == "") {
            this.fullName = "Wrong!!";
        }
        else {
            this.fullName = fullName;
        }
        if (theoryMark > 10) {
            this.theoryMark = 10;
        }
        else if (theoryMark < 0) {
            this.theoryMark = 0;
        }
        else {
            this.theoryMark = theoryMark;
        }
        if (practiceMark > 10) {
            this.practiceMark = 10;
        }
        else if (practiceMark < 0) {
            this.practiceMark = 0;
        }
        else {
            this.practiceMark = practiceMark;
        }

        average();
    }
//      tinh diem trung binh
    public float average() {
        return (this.theoryMark + this.practiceMark)/2;
    }

//    phuong thuc toString dien ta doi tuong dang chuoi
    @Override
    public String toString() {
        return id+" "+fullName+" "+theoryMark+" "+practiceMark+" "+average();
    }

    public void printStudent() {
        System.out.printf("%-5s%-25s%-15.1f%-15.1f%-15.1f \n", id, fullName, theoryMark, practiceMark, average());
    }


//    getter, setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(float theoryMark) {
        this.theoryMark = theoryMark;
    }

    public float getPracticeMark() {
        return practiceMark;
    }

    public void setPracticeMark(float practiceMark) {
        this.practiceMark = practiceMark;
    }
}

