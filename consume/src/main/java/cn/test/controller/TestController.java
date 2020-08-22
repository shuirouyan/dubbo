package cn.test.controller;

import cn.test.interfaces.Report;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WinterSun
 * @date 2020/8/22 - 11:51
 */
@RestController
public class TestController {

    @Reference
    private Report report;

    @RequestMapping("/hello")
    public String methodController() {
        return "hello";
    }

    @RequestMapping("/remoting")
    public String methodReference(@RequestParam String param) {
        String method = report.method(param);
        return "Reference:" + method;
    }

}
