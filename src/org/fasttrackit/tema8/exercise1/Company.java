package org.fasttrackit.tema8.exercise1;

public class Company {

    private EmailAdd emailAdd;
    private FacebookAdd facebookAdd;
    private PrintAdd printAdd;

    public Company(EmailAdd emailAdd, FacebookAdd facebookAdd, PrintAdd printAdd) {
        this.emailAdd = emailAdd;
        this.facebookAdd = facebookAdd;
        this.printAdd = printAdd;
    }
    public void publishToEmail(String message) {
        emailAdd.addSender(message);
    }

    public void publishToFacebook(String message) {
        facebookAdd.addSender(message);
    }

    public void publishToPrint(String message) {
        printAdd.addSender(message);
    }
}
