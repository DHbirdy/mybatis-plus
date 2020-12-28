package com.birdy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.birdy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lvpeng
 * @description
 * @date 2020/12/27-13:20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
