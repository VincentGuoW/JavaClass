package June2024.Class01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataSearchDemo1 {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Phone>phoneList= new ArrayList<Phone>();
        
        Phone p1 = new Phone("MI",1000);
        Phone p2 = new Phone("APPLE",8000);
        Phone p3 = new Phone("HAMMER",2999);

        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);

        ArrayList<Phone> resultList = new ArrayList<Phone>();
        resultList=getPhoneInfo(phoneList);
        if(resultList.size()!=0){
            for (int i = 0; i <resultList.size(); i++) {
                System.out.println("The result: " + resultList.get(i).getName()+" , "+resultList.get(i).getPrice());
            }
        }else{
            System.out.println("There's no phone under $ 3000");
        }
        
    
    
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> phoneList){
        ArrayList<Phone> resultList = new ArrayList<Phone>();

        for (int i = 0; i < phoneList.size(); i++) {
            Phone phoneInfo = phoneList.get(i);
            int phonePrice = phoneInfo.getPrice();
            if(phonePrice<=3000){
                resultList.add(phoneInfo);
            }}
        
        
        return resultList;
    }

}
