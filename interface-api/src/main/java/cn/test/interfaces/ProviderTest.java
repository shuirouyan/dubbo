package cn.test.interfaces;

import cn.test.interfaces.domain.User;

import java.util.List;

/**
 * @author WinterSun
 * @date 2020/8/22 - 13:00
 */
public interface ProviderTest {
    public String providerMethod();
    public List<User> findUser();
}
