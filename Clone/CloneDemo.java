package com.pioneer.polaris.polaris.demo.Clone;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by wxk on 2018/5/2.
 */

public class CloneDemo {

    public static void main(String args[]){

        Person person = new Person();
        person.setName("aaa");
        person.setAge("22");
        person.setHeight("180");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("1");
        hobbies.add("2");
        person.setHobbies(hobbies);
        System.out.println(person);
        Person person1 = (Person) person.clone();
        person1.setName("bbb");
        person1.getHobbies().add("3");
        System.out.println(person1);
    }
}
