package com.gexingw.port.controller;

import com.gexingw.common.util.R;
import com.gexingw.port.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/30
 * @time: 23:23
 */
@RestController
@RequestMapping("port")
public class PortController {

    @Autowired
    PortService portService;

    @GetMapping
    public R index() {
        return R.ok("Port controller ....");
    }

    @GetMapping("/{count}")
    public R count(@PathVariable Long count) {
        return R.ok("Port count:" + count);
    }

    @GetMapping("/order/{id}")
    public R order(@PathVariable Long id){
        Object order = portService.getOrderById(id);
        return R.ok(order);
    }
}
