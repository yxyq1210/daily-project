package cn.yxyq1314.effectivejava.bean;

import java.util.Date;

public class Person {
    private String name;
    private Date birth;

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类普通代码块");
    }

    public Person(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public Person() {
        System.out.println("分类无参数构造器");
    }

    public Date getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }
}
