package org.example.proyectofinal.Controllers;

import org.example.proyectofinal.Services.UserService;
import jakarta.servlet.annotation.WebServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@WebServlet
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("users", userService.findAll());
        return "login";
    }
}
