package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wujiaqin on 2018/10/12.
 */
@Controller
public class UserController {

    @RequestMapping("/toIndex.do")
    public String toIndex(){
        return "index";
    }





}
