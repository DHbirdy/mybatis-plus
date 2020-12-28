package com.birdy;

import com.birdy.mapper.UserMapper;
import com.birdy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // 参数是一个 Wrapper ，条件构造器，这里我们先不用 null
        // 查询全部用户
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testInsert(){
        User user = new User();
        user.setName("三上");
        user.setAge(23);
        user.setEmail("sanshang@qq.com");

        int result = userMapper.insert(user); // 帮我们自动生成id
        System.out.println(result); // 受影响的行数
        System.out.println("================");
        System.out.println(user); // 发现，id会自动回填
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(4L);
        user.setAge(23);
        int updateById = userMapper.updateById(user);
        System.out.println("===============");
        System.out.println(user);

    }

}
