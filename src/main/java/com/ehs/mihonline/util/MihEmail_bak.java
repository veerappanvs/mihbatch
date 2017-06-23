/**
 * 
 */
package com.ehs.mihonline.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

/**
 * @author vsubramaniyan
 *
 */
@Component
public class MihEmail_bak {

	public MihEmail_bak(){}
	
	//@Autowired
    private JavaMailSender javaMailSender = new JavaMailSenderImpl();

public void send() {
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo("Veerappan.Subramaniyan@MassMail.State.MA.US");
            helper.setReplyTo("Veerappan.Subramaniyan@MassMail.State.MA.US");
            helper.setFrom("Veerappan.Subramaniyan@MassMail.State.MA.US");
            helper.setSubject("Test mail");
            helper.setText("content");
        } catch (MessagingException e) {
            e.printStackTrace();
        } finally {}
        javaMailSender.send(mail);
        //return helper;
    }
}
