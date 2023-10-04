package ie.atu.lab2p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    @GetMapping("registerUser/{name}/{email}")
    public void registerUser(@PathVariable String name, @PathVariable String email){

    }
}
