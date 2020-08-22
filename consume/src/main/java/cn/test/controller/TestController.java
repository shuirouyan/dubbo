package cn.test.controller;

import cn.test.interfaces.ProviderTest;
import cn.test.interfaces.Report;
import cn.test.interfaces.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WinterSun
 * @date 2020/8/22 - 11:51
 */
@RestController
public class TestController {

    @Reference
    private Report report;

    @Reference
    private ProviderTest providerTest;

    @RequestMapping("/hello")
    public String methodController() {
        return "hello";
    }

    @RequestMapping("/remoting")
    public String methodReference(@RequestParam String param) {
        String method = report.method(param);
        return "Reference:" + method;
    }

    @RequestMapping("/providerMethod")
    public String providerMethod() {
        String method = providerTest.providerMethod();
        return "providerMethod, Reference:" + method;
    }


    @RequestMapping("/findUser")
    public List<User> findUserMethod() {
        List<User> user = providerTest.findUser();
        return user;
    }


}
