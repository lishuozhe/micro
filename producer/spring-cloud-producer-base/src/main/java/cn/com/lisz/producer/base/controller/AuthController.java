package cn.com.lisz.producer.base.controller;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.lisz.common.controller.BaseController;
import cn.com.lisz.common.model.base.AuthModel;
import cn.com.lisz.producer.base.entity.Auth;
import cn.com.lisz.producer.base.service.IAuthService;

@RestController
@RefreshScope
@RequestMapping("/auth")
public class AuthController extends BaseController<Auth, Long, AuthModel, IAuthService> {

}