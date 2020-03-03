package net.togogo;

import net.togogo.bean.Hello;
import org.junit.Test;

public class HelloTest {

    @Test
    public void hello(){
        Hello hello = new Hello();
        System.out.println(hello.sayHello("qianduoduo"));
    }

}
