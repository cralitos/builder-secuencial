import com.example.Email;
import com.example.EmailBuilder1;

/**
 * @author crhernandez
 */
public class Main {
    public static void main(String[] args) {
        Email email = Email.builder().addRecipient("crhernandez")
                .addRecipient("jdoe")
                .setSubject("Hello")
                .setBody("Hello, John. How are you?")
                .setAttachment("file.txt")
                .build();


        System.out.println("email = " + email);
    }
}