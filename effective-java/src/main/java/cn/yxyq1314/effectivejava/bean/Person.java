package cn.yxyq1314.effectivejava.bean;

import java.util.Date;

public class Person {
    private String name;
    private Date birth;

    public Person(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }
}
