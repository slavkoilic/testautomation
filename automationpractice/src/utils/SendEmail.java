/**
 * Common class for sending an email to the designated email address.
 * Not implemented in tests due to missing SMTP credentials
 */


/**
package utils;

import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Message.*;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SendEmail {

    // File Name SendEmail.java

        public void sendMail() {
            // Recipient's email ID needs to be mentioned.
            String to = "symphony@mailinator.com";

            // Sender's email ID needs to be mentioned
            String from = "mail@slavkoilic.com";

            // SMTP host
            String SMTP_HOST_NAME = "smtp.mailendo.com";
            String username = "mail@slavkoilic.com";
            String password = "pass123";

            // Get system properties
            Properties properties = new Properties();

            properties.put("mail.transport.protocol", "smtp");
            properties.put("mail.smtp.host", SMTP_HOST_NAME);
            properties.put("mail.smtp.auth", "true");

            Authenticator auth = new SMTPAuthenticator();
            Session mailSession = Session.getDefaultInstance(properties, auth);

            // Setup mail server


            // Get the default Session object.
            //Session session = Session.getDefaultInstance(properties);

            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(mailSession);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));

                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // Set Subject: header field
                message.setSubject("Some assertions failed!");

                // Now set the actual message
                message.setText("Assertion failed. This is a reminder to analyze test results when you arrive at the office.");

                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
            } catch (MessagingException mex) {
                mex.printStackTrace();
            }
        }
}
 */

