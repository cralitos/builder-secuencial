package com.example;

/**
 * @author crhernandez
 */
public interface EmailBuilder4 extends EmailBuilder3{
    EmailBuilder4 setAttachment(String attachment);

    Email build();
}
