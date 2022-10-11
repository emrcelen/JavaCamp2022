package core.concretes;

import core.abstracts.Logger;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logget to file: " + message);
    }
}
