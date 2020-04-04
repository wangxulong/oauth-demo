package com.example.oauthdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author wangxulong
 * @version 20200404
 */
@Controller
public class LoginController {
    @GetMapping("auto")
    public String success(Model model){
        return "success";
    }
}
