package io.sofastack.stockmng.controller;

import io.sofastack.stockmng.facade.SortedStrategyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LDUFFY
 * @Description: TODO
 * @date 2021/1/18 下午7:36
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private SortedStrategyFacade sortedStrategyFacade;

    @RequestMapping("/productList")
    public String productList(Model model) {
        model.addAttribute("productList", sortedStrategyFacade.getSorted());
        return "index";
    }
}
