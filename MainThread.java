import student.StudentMark;

public class MainThread {
    public static void main(String[] args) {
        StudentMark st1 = new StudentMark("Dang Minh Tri",35,35,5);
        StudentMark st2 = new StudentMark("Dao Hong Luyen",70,70,7);
        st1.displayResult();
        st2.displayResult();

    }

}
