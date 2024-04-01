package org.example.testmail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



/**
 * @author Mallika Dey
 */
@Service
public class MailTestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MailTestService.class);

    public void mailSendToUser() {
        System.out.println("sending mail");

    }
}
