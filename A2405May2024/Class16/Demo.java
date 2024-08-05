package May2024.Class16;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        StudentInfo[] sInfo = new StudentInfo[3];
        
        StudentInfo s1= new StudentInfo(1,"Vincent",27);
        StudentInfo s2= new StudentInfo(2,"TOM",18);
        StudentInfo s3= new StudentInfo(3,"HENRY",53);
        sInfo[0]=s1;
        sInfo[1]=s2;
        sInfo[2]=s3;
        StudentInfo s4= new StudentInfo(4,"YOKI",39);
        StudentInfo[] sInfoNew = new StudentInfo[4];
        ageCheck(sInfo, s4, sInfoNew);

        System.out.println("input the id you want to delete");
        int deleteId = sc.nextInt();
        idCheck(sInfoNew, deleteId);
        
        System.out.println();
        System.out.println("Search student ID:");
        int searchId= sc.nextInt();
        addAge(sInfoNew, searchId);
            
    }



    public static void ageCheck(StudentInfo sInfo[],StudentInfo s4,StudentInfo sInfoNew[]){
        boolean sameAge = false;
        for (int i = 0; i < sInfo.length; i++) {
            int age = sInfo[i].getId();
            if(age==s4.getId()){
                sameAge=true;
                System.out.println("Same ID found plz change it");
                break;
            }
        }
        if(!sameAge){
            for (int i = 0; i < sInfoNew.length-1; i++) {
                sInfoNew[i]=sInfo[i];
            }
            sInfoNew[sInfoNew.length-1]=s4;
            System.out.println();
            for (int i = 0; i < sInfoNew.length; i++) {
                System.out.println("ID: "+sInfoNew[i].getId()+" ;" +
                                    "NAME: "+sInfoNew[i].getName()+" ; "+
                                    "AGE: "+sInfoNew[i].getAge()+";");
            }
        }
    }
        
    public static void  idCheck(StudentInfo sInfoNew[],int deleteId){
        boolean foundID= false;
        for (int i = 0; i < sInfoNew.length; i++) {
            if(sInfoNew[i].getId()==deleteId){
                sInfoNew[i]=null;
                foundID=true;
                break;
            }
        }
        if(foundID){
            for (int i = 0; i < sInfoNew.length; i++) {
                if(sInfoNew[i]!=null){
                    System.out.println("ID: "+sInfoNew[i].getId()+" ;" +
                    "NAME: "+sInfoNew[i].getName()+" ; "+
                    "AGE: "+sInfoNew[i].getAge()+";");
                }
            }
        }
        else{
            System.out.println("Didn't find student ID. Delete failed");
        }
       
    }
    

    public static void addAge(StudentInfo [] sInfoNew,int searchId){
        for (int i = 0; i < sInfoNew.length; i++) {
            if(sInfoNew[i]!=null){
                if(searchId==sInfoNew[i].getId()){
                    sInfoNew[i].setAge(sInfoNew[i].getAge()+1);
                }
            }
        }
        for (int i = 0; i < sInfoNew.length; i++) {
            if(sInfoNew[i]!=null){
                System.out.println("ID: "+sInfoNew[i].getId()+" ;" +
                "NAME: "+sInfoNew[i].getName()+" ; "+
                "AGE: "+sInfoNew[i].getAge()+";");
            }
        }
    }
}
