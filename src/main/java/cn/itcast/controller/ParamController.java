package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("testParam()执行了");
        System.out.println("用户名："+username);
        System.out.println("用户名："+password);
        return "success";
    }
}
