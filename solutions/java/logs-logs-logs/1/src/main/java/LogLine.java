public class LogLine {
    private final String log;
    public LogLine(String logLine) {
        this.log = logLine;
    }

    public LogLevel getLogLevel() {
        String s = log.substring(1,4);
        switch(s)
        {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        String msg =  log.substring(7);
        return level.getEncodedLevel() + ":" + msg;
        
    }
}
