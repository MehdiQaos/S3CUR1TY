package dev.mehdi.devworldthymlif.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {
    @GetMapping("/public/messages")
    public String privateMessages(Model model) {
        model.addAttribute("body", "No body");
        return "response";
    }
}
