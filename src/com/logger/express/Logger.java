package com.logger.express;

/**
 * The Logger interface provides methods to log messages with different log
 * levels.
 */
public interface Logger {

        // Sets the log level for the logger. Messages with a log level below the
        // specified level will not be logged.
        public void setLogLevel(LogLevel level);

        // Logs all level message.
        public void trace(String trace);

        public void debug(String debug);

        public void info(String info);

        public void warn(String warn);

        public void error(String error);

        public void error(Exception e);

        public void fatal(String fatal);

}
