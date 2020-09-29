package cn.yxyq1314.effectivejava.bean;

import java.util.Date;

public class Man extends Person {

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类普通代码块");
    }
    public  Man(){
        super();
        System.out.println("子类无参数构造器");
    }

    public Man(String name, Date birth) {
        super(name, birth);
    }

    public static void main(String[] args) {
        new Man();
    }
}
