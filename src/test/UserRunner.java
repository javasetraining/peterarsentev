package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marv on 5/25/2015.
 */
public class UserRunner {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        users.add(new User("1", "first"));

         for (User user : users){
             System.out.println(user );
         }

    }
}
