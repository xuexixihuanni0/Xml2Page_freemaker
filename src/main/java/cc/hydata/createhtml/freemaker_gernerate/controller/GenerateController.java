package cc.hydata.createhtml.freemaker_gernerate.controller;

import cc.hydata.createhtml.freemaker_gernerate.service.CreataHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GenerateController {

    @Autowired
    private CreataHtml creataHtml;

    @ResponseBody
    @RequestMapping(value = "creata")
    public String create() throws Exception {
        return creataHtml.createHtml();
    }
}
