package core.concretes;

import core.abstracts.Logger;

public class MailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logget to mail: " + message);
    }
}
