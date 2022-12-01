package com.gexingw.user.controller;

import com.gexingw.common.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/30
 * @time: 22:50
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public R index() {
        return R.ok("User Controller...");
    }

}
