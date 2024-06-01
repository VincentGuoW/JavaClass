package May2024.Class21;

import java.util.ArrayList;

public class ArrayListDemo6 {
    // user: id;username,password. If id exist, return ture;
    public static void main(String[] args) {
        ArrayList<Users> arrayList = new ArrayList<>();
        // Users user1 = new Users(); not a good way, Take too long
        // user1.setId(123);
        // user1.setUsername("123");
        // user1.setPassword("123");
        // arrayList.add(user1);
        Users user1 = new Users(123,"abc","12345");
        Users user2 = new Users(321,"def","54321");
        Users user3 = new Users(567,"zhy","09754");
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);//testtest


       }

        public static boolean ableToFindID (int id,  ArrayList<Users> arrayList ){

            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getId()==id){
                    System.out.println(true);
                    System.out.println(arrayList.get(i).getUsername());
                    return true;
                }
                else{
                    System.out.println(false);
                    return false;
                }
            }
            return false;
        }
    
}
