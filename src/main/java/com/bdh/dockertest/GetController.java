package com.bdh.dockertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController {
    @Autowired TestMapper testMapper;

    @GetMapping("/a")
    public String get_a(Model model) {
        var datas = testMapper.getDatas();
        model.addAttribute("datas", datas);
        return "dockertest";
    }
}
