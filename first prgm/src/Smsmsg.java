import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
 
 
 class SMTPSend {
 
 public SMTPSend() {
 
 }
 
 public void msgsend() {
 
  String username = "MySMSUsername";
 
  String password = "MyPassword";
 
  String smtphost = "MySMSHost.com";
 
  String compression = "My SMS Compression Information";
 
  String from = "mySMSUsername@MySMSHost.com";
 
  String to = "PhoneNumberToText@sms.MySMSHost.com";
 
  String body = "Hello SMS World!";
 
  Transport myTransport = null;
 
 
 
 
  try {
 
   Properties props = System.getProperties();
 
   props.put("mail.smtp.auth", "true");
 
   Session mailSession = Session.getDefaultInstance(props, null);
 
   Message msg = new MimeMessage(mailSession);
 
   msg.setFrom(new InternetAddress(from));
 
   InternetAddress[] address = {new InternetAddress(to)};
 
   msg.setRecipients(Message.RecipientType.TO, address);
 
   msg.setSubject(compression);
 
   msg.setText(body);
 
   msg.setSentDate(new Date());
   /*
Connect the SMS message to your SMS host address. Save changes to the message and send the information*/
 
 
   myTransport = mailSession.getTransport("smtp");
 
   myTransport.connect(smtphost, username, password);
 
   msg.saveChanges();
 
   myTransport.sendMessage(msg, msg.getAllRecipients());
 
   myTransport.close();
 
  } catch (Exception e) {
 
   e.printStackTrace();
 
  }
 }
 
 public static void main(String[] argv) {
 
  SMTPSend smtpSend = new SMTPSend();
 
  smtpSend.msgsend();
 }
 }