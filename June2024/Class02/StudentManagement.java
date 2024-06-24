package June2024.Class02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        // ArrayList<StudentInfo> StudentInfo = new ArrayList<StudentInfo>();
        // StudentInfo st1 = new StudentInfo(123, "VINCENT", 28, "313 ROAD ON");
        // StudentInfo st2 = new StudentInfo(567, "TOM", 31, "FEAW ROAD ON");
        // StudentInfo st3 = new StudentInfo(890, "YUKI", 29, "1F32 ROAD ON");

        // StudentInfo.add(st1);
        // StudentInfo.add(st2);
        // StudentInfo.add(st3);
        StudentDatabase sd = new StudentDatabase();
        ArrayList<StudentInfo> studentInfoArray = sd.getstudentInfoList();

        while (!logOut) {
            for (int i = 0; i < StartMenu.startMenu().length; i++) {
                System.out.println(StartMenu.startMenu()[i]);
            }
            if (sc.hasNextInt()) {
                int inputNumber = sc.nextInt();
                switch (inputNumber) {
                    case 1:
                        System.out.println("Please add stduent ID: ");
                        boolean existStudentID = false;
                        int newID=0;
                        if(sc.hasNextInt()){
                            newID = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < studentInfoArray.size(); i++) {
                                if (studentInfoArray.get(i).getId()== newID) {
                                    existStudentID = true;
                                    System.out.println("Same ID exist, please try somthing different");
                                    break;
                                } else {
                                }
                            }
                        }else {
                            System.out.println("Wrong input");
                        }
                        
                        
                            
                        
                        

                        if (!existStudentID) {
                            StudentInfo stNew = new StudentInfo();
                    
                            stNew.setId(newID);
                            System.out.println("Please input student name: ");
                            stNew.setName(sc.nextLine());
                            
                            System.out.println("Please input student age: ");
                            stNew.setAge(sc.nextInt());
                            sc.nextLine();
                            
                            System.out.println("Please input student address: ");
                            stNew.setAddress(sc.nextLine());
                            
                            sd.addStudent(stNew);
                            
                        }

                        break;
                    case 2:
                        System.out.println("Please delete stduent");
                        System.out.println("Anything else I can do for you?");
                        break;
                    case 4:
                        System.out.println("Search");
                        for (int i = 0; i < sd.getstudentInfoList().size(); i++) {
                            System.out.println("ID: " + sd.getstudentInfoList().get(i).getId() +
                                    " ; NAME: " + sd.getstudentInfoList().get(i).getName() +
                                    " ; AGE: " + sd.getstudentInfoList().get(i).getAge() +
                                    " ; ADDRESS: " + sd.getstudentInfoList().get(i).getAddress() +
                                    " ; ");
                            System.out.println(
                                    "========================================================================");
                        }
                        break;
                    case 5:
                        System.out.println("Successful Logged out");
                        logOut = true;
                        break;

                    default:
                        System.out.println("Only Number 1-5--------------------------------------------------------");
                        break;
                }
            } else {
                System.out.println("Wrong input--------------------------------------------------------");
            }
            sc.nextLine();
        }
    }

}
