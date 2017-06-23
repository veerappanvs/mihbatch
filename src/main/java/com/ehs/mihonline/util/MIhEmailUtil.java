package com.ehs.mihonline.util;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class MIhEmailUtil {

	/**
	 * Utility method to send simple HTML email
	 * @param session
	 * @param toEmail
	 * @param subject
	 * @param body
	 * @throws MailSendFailureException 
	 */
	
	
	public void sendEmail(String toEmail, String subject, String body) throws MailSendFailureException{
		try
	    {
		    String smtpHostServer = "ITD-SMTP-OUT.state.ma.us";
		    String emailID = "MIH.COMMUNITYEMS@MassMail.State.MA.US";
		    String ccEmailID = "Veerappan.Subramaniyan@MassMail.State.MA.US";
		    
		    Properties props = System.getProperties();

		    props.put("mail.smtp.host", smtpHostServer);
			props.put("mail.smtp.port", "25");

		    Session sess = Session.getInstance(props, null);	
			
			
			
			
	      MimeMessage msg = new MimeMessage(sess);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress("Veerappan.Subramaniyan@MassMail.State.MA.US", "NoReply-JD"));

	      msg.setReplyTo(InternetAddress.parse("Veerappan.Subramaniyan@MassMail.State.MA.US", false));

	      msg.setSubject(subject, "UTF-8");

	      msg.setText(body, "UTF-8");

	      msg.setSentDate(new Date());

	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
	      msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmailID, false));
	      System.out.println("Message is ready");
    	  Transport.send(msg);  

	      System.out.println("EMail Sent Successfully!!");
	    }
	    catch (Exception e) {
	      throw new MailSendFailureException("Unable to send mail");
	    }     
	}
}