package cn.test.imp;

import cn.test.dao.UserDao;
import cn.test.interfaces.ProviderTest;
import cn.test.interfaces.domain.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author WinterSun
 * @date 2020/8/22 - 13:01
 */
@Service
public class ProviderTestImpl implements ProviderTest {

    @Autowired
    private UserDao userDao;

    @Override
    public String providerMethod() {
        String str = "从服务提供者的数据";
        return str;
    }

    @Override
    public List<User> findUser() {
        List<User> user = userDao.findUser();
        return user;
    }
}
