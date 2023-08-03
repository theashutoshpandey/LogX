package com.logger.test;

import com.logger.express.LogLevel;
import com.logger.express.LogOperator;
import com.logger.express.Logger;

public class Main {

    private static Logger logger = LogOperator.getLogger().writeHeaderBanner();

    public static void main(String[] args) {

        logger.trace("This is a trace message.");
        logger.debug("This is a debug message.");
        logger.info("This is an info message.");
        logger.warn("This is a warning message");
        logger.error("This is a error message");
        logger.error(new Exception("This is error printStacktrace message of exception "));
        logger.fatal("This is a fatal message");

        logger.setLogLevel(LogLevel.WARN); // Set log level to WARN

        logger.trace("This debug message won't be logged.");
        logger.debug("This debug message won't be logged.");
        logger.info("This is an info message after changing log level.");
        logger.warn("This is a warning message after changing log level.");
        logger.error("This is an error message after changing log level.");
        logger.fatal("This is an fatal message after changing log level.");

    }
}