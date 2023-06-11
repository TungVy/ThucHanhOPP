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
        this.id = id;
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
    }
//      tinh diem trung binh
    public float average() {
        return (this.theoryMark + this.practiceMark)/2;
    }

//    phuong thuc toString dien ta doi tuong dang chuoi
    @Override
    public String toString() {
        return id+"%-5s"+fullName+"%-30s"+theoryMark+"%-30"+practiceMark+"%-30s"+average();
    }

    //    getter, setter
    public int getId() {
        if (id < 0)
            return 1;
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        if (fullName == "")
            return "Wrong!!";
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getTheoryMark() {
        if (theoryMark >10)
            return 10;
        else if (theoryMark < 0)
            return 0;
        return 0f;
    }
    public void setTheoryMark(float theoryMark) {
        this.theoryMark = theoryMark;
    }

    public float getPracticeMark() {
        if (practiceMark >10)
            return 10;
        else if (practiceMark < 0)
            return 0;
        return 0f;
    }
    public void setPracticeMark(float practiceMark) {
        this.practiceMark = practiceMark;
    }
}
