package com.pioneer.polaris.polaris.demo.Clone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxk on 2018/5/2.
 * 原型模式
 */

public class Person implements Cloneable{

    private String age;
    private String name;
    private String height;
    private List<String> hobbies;


    public Person(){

    }
    public Person(Person person){
        this.age = person.getAge();
        this.name = person.getName();
        this.height = person.getHeight();
        this.hobbies = new ArrayList<>(person.getHobbies());
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        if (this.hobbies != null){
            this.hobbies = new ArrayList<>();
        }
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    protected Object clone(){
//        return new Person(this);//直接进行深拷贝
        Person person = null;
        try {
            person = (Person)super.clone();
            person.name = this.name;
            person.height = this.height;
            person.age = this.age;
            person.hobbies =this.hobbies;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

}
