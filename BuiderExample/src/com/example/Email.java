package com.example;

import java.util.List;

/**
 * @author crhernandez
 */
public class Email {
    private List<String> recipients;
    private String subject;
    private String body;
    private Object attachment;

    private Email(){}


    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    public static EmailBuilder1 builder(){
        return new EmailBuilderDirector(new Email());
    }

    @Override
    public String toString() {
        return "Email{" +
                "recipients=" + recipients +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachment=" + attachment +
                '}';
    }
}
