package com.email_write.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String EmailContent;
    private String tone;
    public String getEmailContent() {
        return EmailContent;
    }

    public void setEmailContent(String emailContent) {
        this.EmailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}
