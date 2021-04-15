package com.springmvc.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("name","Rajesh Jha");
        model.addAttribute("id","3004");
        return "home";
    }
    @RequestMapping("/about")
    public ModelAndView getAbout(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","Rajesh Jha");
        modelAndView.addObject("id",3004);

        modelAndView.setViewName("about");
        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView registration(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(path="/processregistration", method = RequestMethod.POST)
    public ModelAndView processRegistration(@RequestParam("name")String name,@RequestParam("email")String email,
                                            @RequestParam("password")String password){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.addObject("email",email);
        modelAndView.setViewName("welcome");
        return modelAndView;

    }

    @RequestMapping("/fileupload")
    public ModelAndView fileUpload(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("fileupload");
        return modelAndView;
    }

    @RequestMapping(path = "/uploading", method = RequestMethod.POST)
    public ModelAndView fileUploading(@RequestParam("profile")CommonsMultipartFile file){
        ModelAndView modelAndView= new ModelAndView();
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        modelAndView.setViewName("success");
        return modelAndView;
    }



}
