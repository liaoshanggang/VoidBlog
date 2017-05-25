package voidblog.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import voidblog.domain.User;
import voidblog.service.CommonService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lingdeqin on 17-5-24.
 */

@Controller
@RequestMapping("/common")
public class CommonController {
    private Logger log = Logger.getLogger(CommonController.class);

    @Resource
    private CommonService cs;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = cs.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }
}