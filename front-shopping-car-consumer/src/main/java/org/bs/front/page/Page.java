package org.bs.front.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class Page {

    @RequestMapping(value = "test")
    public String test(Model model){
        String s ="this is freemarker";
        System.out.println(s);
        model.addAttribute("str",s);
        return "view/show";
    }


}
