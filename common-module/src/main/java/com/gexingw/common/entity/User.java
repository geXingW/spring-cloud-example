package com.gexingw.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/21
 * @time: 23:29
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    public User(Long id) {
        this.id = id;
        this.name = "User-" + id;
    }
}
