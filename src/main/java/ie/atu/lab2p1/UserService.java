package ie.atu.lab2p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService= emailService;
    }

    public void registerUser(String username, String email){
        //User logic
        emailService.sendEmail(email,"Hello and welcome!");
    }
}
