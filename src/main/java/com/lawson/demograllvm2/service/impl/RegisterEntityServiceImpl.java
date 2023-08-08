package com.lawson.demograllvm2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lawson.demograllvm2.entity.RegisterEntity;
import com.lawson.demograllvm2.mapper.RegisterEntityMapper;
import com.lawson.demograllvm2.service.RegisterEntityService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Lawson
 * @since 2023-08-02
 */
@Service
public class RegisterEntityServiceImpl extends ServiceImpl<RegisterEntityMapper, RegisterEntity> implements RegisterEntityService {

}
