package cn.yxyq1314.thread;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class Thread01Test {

    @Test
    public void Test01() {

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
    public void TestO2() {
        Map<Integer, List<String>> map = new HashMap<>();
        
    }

}
