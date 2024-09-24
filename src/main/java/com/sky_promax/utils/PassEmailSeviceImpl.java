package com.sky_promax.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class PassEmailSeviceImpl implements PassEmailSevice {
	@Autowired
	 private JavaMailSender sender;

	@Override
	public void PassengerEmailService(String to, String sub, String text) {
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(sub);
		msg.setText(text);
		
		sender.send(msg);
		
	}

}
