package A2409Sep2024.Class02;

public class CloneDemo2 {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        int[] data = {1,2,3,4,5,6,7,8,9};
        User u1 = new User(1, "TOM", "PASSWORD", "C\\TEST\\TEST.EXE", data);


        
        User u2 = (User)u1.clone();

        u2.setUsername("Henry");

        int[] arr = u1.getData();
        System.out.println("ARR SAMPLE: "+arr);
        System.out.println("U1 SAMPLE: "+u1.getData());
        System.out.println("U2 SAMPLE: "+u2.getData());
        arr[0]=100;


        System.out.println(u1);
        System.out.println(u2);
        //Gson gson = new Gson();
        //String s = gson.toJson(u1);
        //  use Gson package, the toJson method change u1 to String

        //User u3 = gson.fromJson(s,User.class);
        //  use Gson package, the fromJson method change s back to User.class
        //System.out.println(u3);
        //Consider Excel file save to csv file, then revers back to Excel file.
       

    }
}
