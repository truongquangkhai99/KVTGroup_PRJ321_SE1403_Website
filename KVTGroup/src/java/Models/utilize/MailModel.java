package Models.utilize;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * ClassName : JavaMailAPI.java Description : send mail with java mail API
 *
 * @author KhangNVCE140224
 * @since 19-07-2020
 */
public class MailModel {

    //-------------- Mail API vars ------------------
    private Properties mailServerProperties;
    private Session getMailSession;
    private MimeMessage generateMailMessage;

    //-------------- local vars ------------------
    final private String SENDER_MAIL = "kvtgroup2020@gmail.com";
    final private String PASSWORD = "kvtgroup123";
    final private String SMTP = "smtp.gmail.com";

    //-------------- object vars ------------------
    private String to;
    private String subject;
    private String emailBody;

    public MailModel(String to, String subject, String emailBody) {
        this.to = to;
        this.subject = subject;
        this.emailBody = emailBody;
    }

    public boolean sendMail() {
        try {

            //-------------- setup Mail Server Properties ------------------
            mailServerProperties = System.getProperties();
            mailServerProperties.put("mail.smtp.port", "587");
            mailServerProperties.put("mail.smtp.auth", "true");
            mailServerProperties.put("mail.smtp.starttls.enable", "true");


            //-------------- get Mail Session ------------------

            getMailSession = Session.getDefaultInstance(mailServerProperties, null);
            generateMailMessage = new MimeMessage(getMailSession);
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            generateMailMessage.setSubject("KVT Shop | " + subject);
            emailBody += "<br><br>Your Chat Team <br> <a href='https://www.facebook.com/silver.dry.9'>visit us</a>";
            generateMailMessage.setContent(emailBody, "text/html");


            //-------------- Get Session and Send mail ------------------
            Transport transport = getMailSession.getTransport("smtp");
            transport.connect(SMTP, SENDER_MAIL, PASSWORD);
            transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
            transport.close();

        } catch (AddressException ex) {
            ex.printStackTrace();
            return false;
        } catch (MessagingException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;

    }

}
