package com.email_write.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class emailGeneratorController {



    private final EmailGeneratorService emailGeneratorService;
    public emailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> emailController(@RequestBody EmailRequest emailrequest){
       String response = emailGeneratorService.generateEmailReply(emailrequest);
        return ResponseEntity.ok(response);
    }
}
