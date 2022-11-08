package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {
    public static void main(String[] args) {

//        User user = new User();
//        user.setEmail("mateuszbienias2sd@gmail.com");
//        user.setUserName("mateuszbienias");
//        user.setPassword("Dupa1234!");
//
//        UserDao userDao = new UserDao();
//        userDao.create(user);

        UserDao userDao1 = new UserDao();
//        System.out.println(userDao1.read(1));
//        System.out.println(userDao1.read(2));
//        System.out.println(userDao1.read("mateuszbienias2sd@gmail.com"));
//        User user = userDao1.read(1);
//        user.setUserName("mati");
//        System.out.println(user);
//        userDao1.update(user);

        userDao1.delete(2);


    }
}