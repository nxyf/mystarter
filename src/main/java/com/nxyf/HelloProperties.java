package com.nxyf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: starter
 * @description:
 * @author: myj
 * @create: 2021-01-05 14:18
 */
@ConfigurationProperties(prefix = "nxyf")
public class HelloProperties {

    private static final String DEFAULT_NAME = "南巷有风";

    private static final String DEFAULT_MSG = "hello";

    private String name=DEFAULT_NAME;

    private String msg = DEFAULT_MSG;

    public HelloProperties(String name) {
        this.name = name;
    }

    public HelloProperties() {
    }

    public HelloProperties(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
