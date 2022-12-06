package com.unitedcoder.homework;

public class NewsLetter {
    private String subject;
    private String senderName;
    private String senderEmail;

    public NewsLetter(String senderName, String senderEmail) {
        this.senderName = senderName;
        this.senderEmail = senderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public static void main(String[] args) {
        NewsLetter newsLetter=new NewsLetter("Idikut","Idikut@gmail.com");
        System.out.println(newsLetter.getSenderEmail());
    }
}
