package July2024.Class01.a03staticdemo03;

import java.util.ArrayList;

public class UtilityMaxAge {
    private UtilityMaxAge(){};
    public static int  getMaxAge(ArrayList<Student> Students){
        int maxAge = 0;
        for (int i = 0; i < Students.size(); i++) {
            if(Students.get(i).getAge()>maxAge){
                maxAge=Students.get(i).getAge();
            }
        }
        return maxAge;
    }
}
