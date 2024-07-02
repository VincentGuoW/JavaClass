package June2024.Class03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {
    private ArrayList<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();
    Scanner sc = new Scanner(System.in);
    public StudentDatabase(){
        //st1
        StudentInfo st1 = new StudentInfo(123,"Vincent",28,"313 Road");
        studentInfoList.add(st1);
        //st2
        studentInfoList.add(new StudentInfo(12314,"Tom",31,"FEAW Road"));
        //st3
        studentInfoList.add(new StudentInfo(890,"Tom",29,"1F31 Road"));
    }

    public ArrayList<StudentInfo> getstudentInfoList(){
        return studentInfoList;
    }

    public boolean checkStudentExist(int studentID){
        boolean studentExist = false;
        for (int i = 0; i < studentInfoList.size(); i++) {
            if(studentInfoList.get(i).getId()==studentID){
                studentExist=true;
                System.out.println("Same ID exist, please try somthing different");
                break;
            }
        }
        return studentExist;
    }

    public void addStudent(StudentInfo student){
        studentInfoList.add(student);
    }
    public void deleteStudent(int inputId){
        boolean found = false;
        for (int i = 0; i < studentInfoList.size(); i++) {
            if(inputId==studentInfoList.get(i).getId()){
                System.out.println("Successly removed " + inputId + " ; Student Name: " + studentInfoList.get(i).getName());
                studentInfoList.remove(i);
                found= true;
                break;
            }
        }
        if(!found){
            System.out.println("There's no match student");
        }
    }
    public void changeStudent(int inputId){
        int studentIndex = -1;
        for (int i = 0; i < studentInfoList.size(); i++) {
            if(inputId==studentInfoList.get(i).getId()){
                studentIndex=i;
                break;
            }
        }
        if(studentIndex>=0){
            System.out.println("You want to change student id "+inputId+"  info");
            int changeId = inputId;

            System.out.println("Please input student NAME that you want to change");
            String changeName = sc.nextLine();
           

            System.out.println("Please input student AGE that you want to change");
            int changeAge = sc.nextInt();
            sc.nextLine();

            System.out.println("Please input student ADDRESS that you want to change");
            String changeAddress = sc.nextLine();

            studentInfoList.get(studentIndex).setId(changeId);
            studentInfoList.get(studentIndex).setName(changeName);
            studentInfoList.get(studentIndex).setAge(changeAge);
            studentInfoList.get(studentIndex).setAddress(changeAddress);

        
        }else{
            System.out.println("Wrong ID, no student found.");
        }
        
    }

    
}
