package cn.yxyq1314.thread;

import java.util.stream.IntStream;

public class ThreadYield {

    public static void main(String[] args) {
        IntStream.range(0, 2).mapToObj(ThreadYield::create).forEach(Thread::start);
    }

    private static Thread create(final int index) {
        Thread thread = new Thread(() -> {
            if (index==0) {
                Thread.yield();
            }
            System.out.println(index);
        });
        return thread;
    }

    private static Thread create1(int seq){
        return new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"#"+i);
            }
        },String.valueOf(seq));
    }

}
