package cn.test;

import cn.test.imp.ProviderTestImpl;
import cn.test.interfaces.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author WinterSun
 * @date 2020/8/22 - 14:01
 */
public class TestMain {
    @Autowired
    private ProviderTestImpl providerTest;

    @Test
    public void testMethod() {
        List<User> user = providerTest.findUser();
        user.forEach(it -> System.out.println(it));
    }
}
