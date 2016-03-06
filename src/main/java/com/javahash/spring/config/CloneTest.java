package com.javahash.spring.config;

import java.util.Date;

/**
 * Created by Натали on 28.02.2016.
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User petja = new User("petja", 66,new Date());
        User clone = (User)petja.clone();
        petja.setAge(55);
        petja.setName("vasja");
        System.out.println(clone);
    }
}
