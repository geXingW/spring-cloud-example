package com.gexingw.order.controller;

import com.gexingw.common.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/30
 * @time: 22:53
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping
    public R index() {
        return R.ok("Order controller ...");
    }

    @GetMapping("/{id}")
    public R show(@PathVariable Long id) {
        return R.ok("Order-" + id);
    }
}
