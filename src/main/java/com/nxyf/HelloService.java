package com.nxyf;

/**
 * @program: starter
 * @description:
 * @author: myj
 * @create: 2021-01-05 14:25
 */
public class HelloService {

    private String name;

    private String msg;

    public String sayHello() {
        System.out.println("name:"+name+"---msg:"+msg);
        return "name:"+name+"---msg:"+msg;
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
