package org.bs.front.controller;

import org.bs.front.pojo.user.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("page")
public class PageController {

       @GetMapping("toMain")
       public   String  toIndex(){
             return   "jsp/main";
       }

       @GetMapping("toLogin")
       public   String  toLogin(){
            return   "jsp/login";
       }

       @GetMapping("/toEnroll")
       public   String   toEnroll(){
            return "jsp/enroll";
       }

        @GetMapping("/toUser")
        public   String   toUser(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
            return "jsp/free";
        }

        @GetMapping("/toUserCenter")
        public   String   toUserCenter(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
             return "jsp/userCenter";
        }

        @GetMapping("/toRetrieve")
        public   String   toRetrieve(){
              return  "jsp/retrieve";
        }

        @GetMapping("/toFreeCenter")
        public   String   toFreeCenter(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
            return  "center/freeCenter";
        }

        @GetMapping("/toMeans")
        public   String   toMeans(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
            return "personal/means";
        }

        @GetMapping("/toModify")
        public   String   toModify(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
            return "personal/modify";
        }

        @GetMapping("/toCommodity")
        public   String   toCommodity(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
              return "personal/commodity";
        }

        @GetMapping("/to403")
        public  String  to403(){
              return   "403";
        }

        @GetMapping("/toAddress")
        public   String   toAddress(Model model, HttpSession session){
            UserBean user = (UserBean)session.getAttribute(session.getId());
            model.addAttribute("user",user);
            return "personal/address";
        }

        @GetMapping("/toDiZhi")
        public   String   toDiZhi(){
            return "personal/dizhi";
        }

}
