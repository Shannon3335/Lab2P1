package ie.atu.lab2p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/registerUser/{name}/{email}")
    public User registerUser(@PathVariable("name")String name, @PathVariable("email")String email){
        return new User(name, email);
    }

    @PostMapping("/registerUserBody")
    public User registerUserBody(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        return user;
    }
}
