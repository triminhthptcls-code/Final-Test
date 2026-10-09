package student;
public class StudentMark {
   private String fullName;
   private double theoryMark;
   private double practicalMark;
   private double assignmentMark;
   public StudentMark (String fullName, double theoryMark, double practicalMark, double assignmentMark){
    this.fullName = fullName;
    this.theoryMark = theoryMark;
    this.practicalMark = practicalMark;
    this.assignmentMark = assignmentMark;}
    public String getFullName() {
        return fullName;
    }
    public double getTheoryMark() {
        return theoryMark;
    }
    public double getPracticalMark() {
        return practicalMark;
    }
    public void setTheoryMark(double theoryMark){
        this.theoryMark = theoryMark;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setPracticalMark(double practicalMark){
        this.practicalMark = practicalMark;
    }
 public double getAssignmentMark() {
        return assignmentMark;
    }
public void setAssignmentMark(double assignmentMark){
        this.assignmentMark = assignmentMark;
    }
public boolean checkPass() {
    if(theoryMark >= 40 && practicalMark>=40 && assignmentMark>=4.0){
        return true;
    }
    return false;
}
public void displayResult() {
    System.out.println("Ho ten :"+ fullName);
    System.out.println("Diem ly thuyet :" + theoryMark);
    System.out.println("Diem thuc hanh :" + practicalMark);
    System.out.println("Diem bai tap lon :" + assignmentMark);
    if(checkPass()) {
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }
}
   }

