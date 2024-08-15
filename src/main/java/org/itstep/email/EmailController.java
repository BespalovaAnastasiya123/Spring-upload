package org.itstep.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;
    @GetMapping("/sendsimple")
    public String sendSimple(Model model){
        Email email = new Email();
        email.setTo("3537184@gmail.com");
        email.setFrom("3537184@gmail.com");
        email.setSubject("Simple text");
        emailService.sendSimpleMessage(email);
        return "success";
    }
}