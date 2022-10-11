package core.concretes;

import core.abstracts.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logget to database: " + message);
    }
}
