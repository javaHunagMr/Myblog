package com.myblog.demo.service.impl;

import com.myblog.demo.entity.User;
import com.myblog.demo.mapper.UserMapper;
import com.myblog.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hzh
 * @since 2021-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
