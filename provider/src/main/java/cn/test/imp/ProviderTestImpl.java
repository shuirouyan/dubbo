package cn.test.imp;

import cn.test.interfaces.ProviderTest;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author WinterSun
 * @date 2020/8/22 - 13:01
 */
@Service
public class ProviderTestImpl implements ProviderTest {
    @Override
    public String providerMethod() {
        String str = "从服务提供者的数据";
        return str;
    }
}
