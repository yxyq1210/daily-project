package cn.yxyq1314.thread;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class Thread01Test {

    @Test
    public void test01() {

        class MemoryCell {
            private Object defaultValue;

            public Object read() {
                return defaultValue;
            }

            public void write(Object x) {
                defaultValue = x;
            }
        }
    }

    @Test
    public void testO2() {
        Map<Integer, List<String>> map = new HashMap<>();
        
    }

   /* public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1, 3).mapToObj(Thread01Test::create).collect(Collectors.toList());
        threads.forEach(Thread::start);
        for(Thread thread:threads){
            thread.join();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"%"+i);
            TimeUnit.SECONDS.sleep(1);
        }
    }*/


}
