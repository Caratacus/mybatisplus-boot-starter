package com.baomidou.mybatisplus.sample.service.impl;


import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.sample.entity.Account;
import com.baomidou.mybatisplus.sample.mapper.AccountMapper;
import com.baomidou.mybatisplus.sample.service.IAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-04-05
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
