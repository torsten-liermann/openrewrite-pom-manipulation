package org.example;

import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
public class Test {
    static CdiRunner abc;

    void test() {
        System.out.println(abc);
    }
}
