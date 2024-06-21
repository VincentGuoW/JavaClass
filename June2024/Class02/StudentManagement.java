package June2024.Class02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        ArrayList<StudentInfo>StudentInfo = new ArrayList<StudentInfo>();
        StudentInfo st1 = new StudentInfo(123, "VINCENT", 28, "313 ROAD ON");
        StudentInfo st2 = new StudentInfo(567, "TOM", 31, "FEAW ROAD ON");
        StudentInfo st3 = new StudentInfo(890, "YUKI", 29, "1F32 ROAD ON");

        StudentInfo.add(st1);
        StudentInfo.add(st2);
        StudentInfo.add(st3);

        
        while (!logOut) {
            for (int i = 0; i < StartMenu.startMenu().length; i++) {
                System.out.println(StartMenu.startMenu()[i]);
            }
            if (sc.hasNextInt()) {
                int inputNumber = sc.nextInt();
                switch (inputNumber) {
                    case 1:
                        System.out.println("Please add stduent ID: ");
                        StudentInfo stNew = new StudentInfo();
                        if (sc.hasNextInt()){
                            int newID= sc.nextInt();
                            for (int i = 0; i <StudentInfo.size(); i++) {
                                if(StudentInfo.get(i).getId()==newID){
                                    System.out.println("Same ID exist, please try somthing different");
                                    break;
                                }
                                else{
                                    stNew.setId(newID);
                                }
                            }
                        }
                        else{
                            System.out.println("Wrong input");
                        }
                        System.out.println("Please add stduent NAME: ");
                        System.out.println("Please add stduent AGE: ");
                        System.out.println("Please add stduent ADDRESS: ");
                            //test test


                        break;
                    case 2:
                        System.out.println("Please delete stduent");
                        System.out.println("Anything else I can do for you?");
                        break;
                    case 4:                      
                        System.out.println("Search");
                        for (int i = 0; i < StudentInfo.size(); i++) {
                            System.out.println("ID: "+StudentInfo.get(i).getId()+
                                               " ; NAME: "+StudentInfo.get(i).getName()+
                                               " ; AGE: "+StudentInfo.get(i).getAge()+
                                               " ; ADDRESS: "+StudentInfo.get(i).getAddress()+
                                               " ; ");
                            System.out.println("========================================================================");
                        }
                        break;
                    case 5:
                        System.out.println("Successful Logged out");
                        logOut=true;
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
