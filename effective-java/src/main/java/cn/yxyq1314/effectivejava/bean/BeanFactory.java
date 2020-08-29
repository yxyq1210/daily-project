package cn.yxyq1314.effectivejava.bean;

import java.util.Date;

public class BeanFactory {

    private void Singleson(){

    }
        private static BeanFactory beanFactory = new BeanFactory ();
        private BeanFactory (){}
        public static  BeanFactory getInstance(){return beanFactory;}


    public static void main(String[] args) {
        Person per = new Person("易鑫", new Date());

    }

    }


