package cn.yxyq1314.thread;

public class FirstThread {

    public static class WinRunable implements Runnable{

        @Override
        public void run() {
            System.out.println("测试线程1");
        }
    }

    public static void main(String[] args) {
        WinRunable winRunable = new WinRunable();
        winRunable.run();
    }
}
