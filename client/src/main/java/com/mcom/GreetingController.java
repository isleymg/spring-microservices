package com.mcom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
public class GreetingController {
    @Autowired
    private GreetingClient client;
    
    @Autowired
    private GreetingClient myClient;
    
    @RequestMapping("/thegreet")
    @HystrixCommand(fallbackMethod="problem")
    public String theGreeting(Model model)
    {
        System.out.println("Controller was hit...");
        
        model.addAttribute("greeting", client.greet());
        
        //looks in templates folder and adds .html on end
        return "home";
    }
    
    
    @RequestMapping("/mygreet")
    @HystrixCommand(fallbackMethod="problem")
    public String theNewGreeting(Model model) {
    		model.addAttribute("mygreeting", myClient.greet());
		
    		return "home";
    }
    
    public String problem(Model model) {
    		model.addAttribute("greeting", "Huge Problemo");
    		return "home";
    }
}