package com.xiaoout.springmvc.controller;

import com.xiaoout.springmvc.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cchen17 on 7/24/2017.
 */

@Controller
public class FormController {

    @RequestMapping(value = "/formname" , method = RequestMethod.GET)
    public String getForm(ModelMap modelMap){
        Form form = new Form();
        modelMap.addAttribute("form",form);
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(Form form, BindingResult result, ModelMap modelMap){
        if(result.hasErrors()){
            return "fail";
        }
        modelMap.addAttribute("success", "Dear "+ form.getName()+" , your Registration completed successfully");
        modelMap.addAttribute("receivePaper", form.isReceivePaper());

        return "success";
    }
}
