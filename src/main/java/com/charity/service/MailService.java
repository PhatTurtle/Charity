package com.charity.service;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class MailService {
	@Autowired
	JavaMailSender sender;

	public void sendEmail(String contactName,String contactEmail,String contactSubject,String contactMessage) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		// Sử dụng Helper để thiết lập các thông tin cần thiết cho message
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
		String subject  = "TranBao";
		String content = "<html>"
				+ "<head>"
				+ "<style>"
				+ "body { font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; color: #333333; line-height: 1.5; margin: 0; padding: 0; }"
				+ ".container { max-width: 600px; margin: 0 auto; padding: 20px; }"
				+ "p { font-size: 16px; margin-bottom: 10px; }"
				+ "strong { color: #000000; font-weight: bold; }"
				+ "</style>"
				+ "</head>"
				+ "<body>"
				+ "<div class='container'>"
				+ "<p>Customer Name: <strong>" + contactName + "</strong></p>"
				+ "<p>Customer Email: <strong>" + contactEmail + "</strong></p>"
				+ "<p>Customer Subject: <strong>" + contactSubject + "</strong></p>"
				+ "<p>Customer Message: <strong>" + contactMessage + "</strong></p>"
				+ "</div>"
				+ "</body>"
				+ "</html>";

		helper.setFrom("baotdgps20506@fpt.edu.vn");
//		helper.setTo("nganvps24932@fpt.edu.vn");
		helper.setTo("nganvps24932@fpt.edu.vn");
		helper.setSubject(subject);
		helper.setText(content, true);
		helper.setReplyTo("baotdgps20506@fpt.edu.vn");
		// Gửi message đến SMTP server
		sender.send(message);
	}


}
