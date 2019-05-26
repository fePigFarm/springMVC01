package com.faith.handler;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-26
 * @Description: com.faith.handler
 * @version: 1.0
 */

@Controller
@RequestMapping(value = "promotion")
public class SpringMVCHandler {

    @RequestMapping(value = "welcome")
    public String welcome() {
        return "success";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add() {
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = {"yang=杨"})
    public String addYang() {
        return "add";
    }

    // 一层
    @RequestMapping(value = "welcome/*/abc", method = RequestMethod.GET)
    public String welcomeAnt1() {
        return "success";
    }

    // 任意多层
    @RequestMapping(value = "welcome/**/abc", method = RequestMethod.GET)
    public String welcomeAnt2() {
        return "success";
    }

    // 接收参数
    @RequestMapping(value = "welcome/{name}", method = RequestMethod.GET)
    public String welcomeParams(@PathVariable("name") String name) {
        System.out.println(name);
        return "success";
    }
}
