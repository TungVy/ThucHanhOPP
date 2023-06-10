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
