package com.test.controller;

/**
 * Created by Travis Brindley on 7/21/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView invalidUsername(boolean invalid) {
        if(invalid){
            return new
                    ModelAndView("welcome","invalid","Invalid username & password");
        }
        else{
            return new ModelAndView("welcome","invalid","");
        }
    }
    @RequestMapping("/gohome")
    public String goHome(){
        return "/posSystem";
    }

    @RequestMapping("/posSystem")
    public String posSystem(Model model, @RequestParam("email") String email, @RequestParam("password") String password){
        if(email.equalsIgnoreCase("travisbrindley@gmail.com") && password.equals("password123")){
            userInfo("Travis");
            return "/posSystem";
        }
        else{
            invalidUsername(true);
            return "/welcome";
        }

    }
    public ModelAndView userInfo(String firstname) {

        return new
                ModelAndView("posSystem","user",firstname);

    }
 @RequestMapping("/verifylogin")
    public String verifylogin(Model model, @RequestParam("username") String username, @RequestParam("password") String password){
        model.addAttribute("username", username);
        model.addAttribute("password",password);
        return "/UI";
    }

    @RequestMapping("/addUser")
    // model is a parameter that allows us to add stuff to our jsp
    // Request parameter allows us to take in data from the form -- we must assign a type and a variable with it
    public String addUser(Model model, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("email") String email,@RequestParam("tel") String tel, @RequestParam("password") String password){
        //add the values to the jsp using the model and addAttribute method
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        model.addAttribute("email", email);
        model.addAttribute("tel", tel);
        model.addAttribute("password", password);

        return "/usercreated";
    }

}
