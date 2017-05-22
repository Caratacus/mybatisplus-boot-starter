package com.baomidou.mybatisplus.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.sample.entity.Account;
import com.baomidou.mybatisplus.sample.service.IAccountService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-02-20
 */
@RestController
@RequestMapping("/hotel")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @ResponseBody
    @GetMapping("/")
    public List<Account> getAll() {
        return accountService.selectList(Condition.EMPTY);
    }

}
