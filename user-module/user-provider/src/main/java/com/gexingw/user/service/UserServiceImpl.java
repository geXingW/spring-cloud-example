package com.gexingw.user.service;

import com.gexingw.common.entity.User;
import com.gexingw.common.util.R;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/21
 * @time: 23:24
 */
@DubboService
public class UserServiceImpl implements UserService{

    @Override
    public R findById(Long id){
        return R.ok(new User(id));
    }
}
