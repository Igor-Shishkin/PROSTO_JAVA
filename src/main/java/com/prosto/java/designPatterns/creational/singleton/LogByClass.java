package com.prosto.java.designPatterns.creational.singleton;

public class LogByClass {
    private static LogByClass INSTANCE;
    private StringBuffer logFile = new StringBuffer("This is log file\n");

    private LogByClass() {
    }
    public static LogByClass getInstance() {
        if (INSTANCE == null) {
            synchronized (LogByClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LogByClass();
                }
            }
        }
        return INSTANCE;
    }
    public void addInfo(String info) {
        logFile.append(info).append("\n");
    }
    public String showLog() {
        return logFile.toString();
    }
}







