package com.liucccc.liuccccspringboot.dao;

import com.liucccc.liuccccspringboot.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * userMapper
 *
 * @author Liucccc
 */
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    @Results({
            @Result(property = "username", column = "user_name"),
            @Result(property = "password", column = "password"),
            @Result(property = "age", column = "age")
    })
    User getUser(Long id);

    @Select("select * from t_user where id = #{id} and user_name=#{name}")
    User getUserByIdAndName(@Param("id") Long id, @Param("name") String username);

    @Select("select * from t_user")
    List<User> getAll();

    /**
     * 使用xml方式
     */
    User getUserByName(String username);
}
