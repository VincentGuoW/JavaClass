package June2024.Class01;

import java.util.ArrayList;

public class GetPhoneInfo {
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
