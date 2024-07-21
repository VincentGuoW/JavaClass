package July2024.Class01;

public class note {
    private String studentName;

    public String teacherName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    note in1 = new note();
    //in1.teacherName="xxx";
    //in1.setStudentName("xxx");

    // but all the teacher name have to do seperately.  in1.teacherNme in2.teacherName ....

    // we can use static to makesure there's only one value all for different in1 in2 in3..

    // public String teacherName  ==> public static String teacherName

    // we can use note.techaerName for any in1 in2 in3's teacherName
}
