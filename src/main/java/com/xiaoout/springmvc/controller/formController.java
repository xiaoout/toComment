package com.xiaoout.springmvc.controller;

import com.xiaoout.springmvc.model.Form;
import com.xiaoout.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
@Controller
public class formController {

    @RequestMapping(value = "/welcomform",method = RequestMethod.GET)
    public String getintoWelcome(ModelMap modelMap){
        Form form = new Form();
        modelMap.addAttribute("form",form);
        return "form";
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String saveRegistration(@Valid Student student, BindingResult result, ModelMap model){
//
//        if(result.hasErrors()) {
//            return "enroll";
//        }
//
//        model.addAttribute("success", "Dear "+ student.getFirstName()+" , your Registration completed successfully");
//        return "success";
//    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveFrom(Form form, BindingResult result, ModelMap modelMap){
        if(result.hasErrors()){
            return "fail";
        }
        modelMap.addAttribute("success", "Your name" + form.getName());
        return "success";
    }
}
