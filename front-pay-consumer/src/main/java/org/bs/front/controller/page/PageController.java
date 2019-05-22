package org.bs.front.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lenovo
 * @title: PageController
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1519:57
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/toPayManey")
    public String toPayManey(){
        return "view/payManey";
    }

    @RequestMapping("/toMain")
    public String toMain(){
        return "main.ftl";
    }

    @RequestMapping("/toSolrShop")
    public String toSolrShop(){
        return "view/solr";
    }

    @RequestMapping("/toSettleAccounts")
    public String toSettleAccounts(){
        return "view/settle";
    }

    @RequestMapping("/toExcel")
    public String toExcel(){
        return "view/excel";
    }
}
