package org.example.testmail;

import com.bjit.mailservice.models.MailContent;
import com.bjit.mailservice.services.MailSender;
import jakarta.mail.MessagingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Mallika Dey
 */
@Service
public class MailTestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MailTestService.class);
    @Autowired
    private MailSender mailSender;

    public void mailSendToUser() {
        System.out.println("sending mail");
        try {
            MailContent mailContent = new MailContent();
            mailContent.setTo(new ArrayList<>(Arrays.asList("mallika.dey@bjitgroup.com")));
            mailContent.setFrom("khalid.hasan@bjitgroup.com");
            mailContent.setSubject("Testing mailservice as a jar in another application");
            mailContent.setBody("Test sendgrid mail service");
            mailSender.sendMailWithHTMLTemplate(mailContent);
        } catch (MessagingException ex) {
            LOGGER.error("error");
        }
    }
}
