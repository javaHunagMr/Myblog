package com.myblog.demo.service.impl;

import com.myblog.demo.entity.Blog;
import com.myblog.demo.mapper.BlogMapper;
import com.myblog.demo.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 33904
 * @since 2021-12-14
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
