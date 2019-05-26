package com.faith.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-26
 * @Description: com.faith.handler
 * @version: 1.0
 */

@Controller
public class SpringMVCHandler {

    @RequestMapping("welcome")
    public String welcome() {
        return "success";
    }
}
