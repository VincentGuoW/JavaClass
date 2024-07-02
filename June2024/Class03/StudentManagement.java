package June2024.Class03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDatabase sd = new StudentDatabase();

        loop: while (true) {
            StartMenu sm = new StartMenu();
            sm.startMenu();
            if (sc.hasNextInt()) {
                int inputNumber = sc.nextInt();
                sc.nextLine();
                int newID = 0;
                switch (inputNumber) {
                    case 1 -> {
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
                    }

                    case 2 -> {
                        System.out.println("Please input delete stduent ID");
                        newID = sc.nextInt();
                        sc.nextLine();
                        sd.deleteStudent(newID);

                        break;
                    }
                    case 3 -> {
                        System.out.println("Please input change stduent ID");
                        newID = sc.nextInt();
                        sc.nextLine();
                        sd.changeStudent(newID);
                        break;
                    }
                    case 4 -> {
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
                    }
                    case 5 -> {
                        System.out.println("Successful Logged out");
                        break loop;
                        // System.exit(0)
                        //or we can use System.exit(0) to stop the whole function.
                    }

                    default -> {
                        System.out.println("Only Number 1-5--------------------------------------------------------");
                        break;
                    }
                }

            } else {
                System.out.println("Wrong input--------------------------------------------------------");
            }

        }
    }

}
