package cn.test.dao;

import cn.test.interfaces.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WinterSun
 * @date 2020/8/22 - 13:57
 */
@Mapper
public interface UserDao {

    List<User> findUser();
}
