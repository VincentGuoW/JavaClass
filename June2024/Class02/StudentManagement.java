package June2024.Class02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        StudentDatabase sd = new StudentDatabase();

        while (!logOut) {
            for (int i = 0; i < StartMenu.startMenu().length; i++) {
                System.out.println(StartMenu.startMenu()[i]);
            }
            if (sc.hasNextInt()) {
                int inputNumber = sc.nextInt();
                sc.nextLine();
                int newID = 0;
                switch (inputNumber) {
                    case 1:
                        boolean studentExist = true;
                        System.out.println("Please add stduent ID: ");
                        if (sc.hasNextInt()) {
                            newID = sc.nextInt();
                            studentExist = sd.checkStudentExist(newID);
                        } else {
                            System.out.println("Wrong input");

                        }

                        if (!studentExist) {
                            StudentInfo stNew = new StudentInfo();
                            stNew.setId(newID);
                            sc.nextLine();

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
                        System.out.println("Please input delete stduent ID");
                        newID = sc.nextInt();
                        sc.nextLine();
                        sd.deleteStudent(newID);

                        break;
                    case 3:
                        System.out.println("Please input change stduent ID");
                        newID = sc.nextInt();
                        sc.nextLine();
                        sd.changeStudent(newID);
                        break;
                    case 4:
                        System.out.println("Search");
                        if(sd.getstudentInfoList().size()==0){
                            System.out.println("No student info");
                            break;
                        }
                        System.out.println("ID\t\tNAME\tAGE\tADDRESS\t");
                        for (int i = 0; i < sd.getstudentInfoList().size(); i++) {
                            System.out.println("ID: " + sd.getstudentInfoList().get(i).getId() + "\t\t"+
                                    " ; NAME: " + sd.getstudentInfoList().get(i).getName() +"\t"+
                                    " ; AGE: " + sd.getstudentInfoList().get(i).getAge() +"\t"+
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

        }
    }

}
