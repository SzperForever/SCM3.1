package com.jabil.mapper;

import com.jabil.pojo.Users;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface UsersMapper extends Mapper<Users> {
}