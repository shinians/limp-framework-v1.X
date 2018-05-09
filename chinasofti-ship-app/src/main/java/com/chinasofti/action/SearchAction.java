package com.chinasofti.action;

import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by a on 2017/8/29.
 */
@Controller
@RequestMapping("/ship/search")
public class SearchAction extends AbstractAction {
    @Access(login = true, privilege = false)
    @RequestMapping(value = "index")
    public String save(Model model, String uid) {
        return "search/search_index";
    }
    @Access(login = true, privilege = false)
    @RequestMapping(value = "result")
    public String result(HttpServletRequest request,Model model, String key,String type) {
        request.setAttribute("key",key);
        request.setAttribute("type",type);
        return "search/search_result";
    }
    @Access(login = true, privilege = false)
    @RequestMapping(value = "adv")
    public String adv(Model model, String uid) {
        return "search/search_adv";
    }

}
