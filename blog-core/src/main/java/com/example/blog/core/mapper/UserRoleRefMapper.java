package com.example.blog.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.api.entity.UserRoleRef;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author example
 */
@Mapper
public interface UserRoleRefMapper extends BaseMapper<UserRoleRef> {

    /**
     * 根据用户Id删除
     *
     * @param userId 用户Id
     * @return 影响行数
     */
    Integer deleteByUserId(Long userId);
}

