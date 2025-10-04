public class LogLevels {
    
    public static String message(String logLine) {
        String s = logLine.split(":")[1];
        
        return s.trim();
    }

    public static String logLevel(String logLine) {
       String s = logLine.split(":")[0];
        int n = s.length();
        return s.substring(1,n-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) +")";
    }
}
