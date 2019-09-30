package com.atguigu.maven;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import com.atguigu.maven.Hello;
public class HelloFriendTest {
    @Test
    public void testHelloFriend() {
        HelloFriend  helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloToFriend("litingwei");
        assertEquals("Hello litingwei I am John",results);
 }
}