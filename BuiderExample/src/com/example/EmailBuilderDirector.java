package com.example;

import java.util.ArrayList;

/**
 * @author crhernandez
 */
public class EmailBuilderDirector implements EmailBuilder1, EmailBuilder2, EmailBuilder3, EmailBuilder4{

    private Email email;

    protected EmailBuilderDirector(Email email) {
        this.email = email;
    }
    @Override
    public EmailBuilder4 setAttachment(String attachment) {
        this.email.setAttachment(attachment);
        return this;
    }

    @Override
    public EmailBuilder4 setBody(String body) {
        this.email.setBody(body);
        return this;
    }

    @Override
    public EmailBuilder3 setSubject(String subject) {
        this.email.setSubject(subject);
        return this;
    }

    @Override
    public EmailBuilder2 addRecipient(String recipient) {
        if (this.email.getRecipients()==null || this.email.getRecipients().isEmpty()){
            this.email.setRecipients(new ArrayList<>());
        }
        this.email.getRecipients().add(recipient);
        return this;
    }

    @Override
    public Email build() {
        return this.email;
    }
}
