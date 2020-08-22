package cn.test.imp;

import cn.test.interfaces.Report;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author WinterSun
 * @date 2020/8/22 - 11:35
 */
@Service
public class ReportImpl implements Report {

    @Override
    public String method(String string) {
        return "hello dubbo, remoting method" + string;
    }
}
