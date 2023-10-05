package ie.atu.lab2p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLOutput;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("registerUser/{name}/{email}")
    public void registerUser(@PathVariable String name, @PathVariable String email){

    }

    @PostMapping("registerUserBody")
    public void registerUserBody(@RequestBody User user){
        System.out.println(user.name);
        System.out.println(user.email);
    }
}
