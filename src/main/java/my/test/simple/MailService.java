package my.test.simple;

import org.springframework.stereotype.Component;

@Component
public class MailService {
	public void sendMail() {
		System.out.println("Mail has been send.");
	}
}
