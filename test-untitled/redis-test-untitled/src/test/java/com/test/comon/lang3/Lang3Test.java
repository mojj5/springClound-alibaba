package com.test.comon.lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class Lang3Test {


    @Test
    public void test(){
        Integer[] integers = ArrayUtils.toArray(1, 2);
        String[] strings = ArrayUtils.toArray("s", "s");
        Integer[] integers1 = ArrayUtils.nullToEmpty(integers);


    }
}
