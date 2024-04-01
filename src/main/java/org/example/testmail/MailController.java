package org.example.testmail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mallika Dey
 */
@RestController
public class MailController {
    private final MailTestService mailTestService;

    public MailController(MailTestService mailTestService) {
        this.mailTestService = mailTestService;
    }

    @GetMapping("/sendmail")
    public String sendMail() {
        mailTestService.mailSendToUser();
        return "success";
    }
}
