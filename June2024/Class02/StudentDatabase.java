package June2024.Class02;

import java.util.ArrayList;

public class StudentDatabase {
    private ArrayList<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();

    public StudentDatabase(){
        //st1
        StudentInfo st1 = new StudentInfo(123,"Vincent",28,"313 Road");
        studentInfoList.add(st1);
        //st2
        studentInfoList.add(new StudentInfo(123,"Tom",31,"FEAW Road"));
        //st3
        studentInfoList.add(new StudentInfo(890,"Tom",29,"1F31 Road"));
    }

    public ArrayList<StudentInfo> getstudentInfoList(){
        return studentInfoList;
    }

    public void addStudent(StudentInfo student){
        studentInfoList.add(student);
    }
}
