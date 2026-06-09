public class LogLevels {
    //LogLevels.logLevel("[ERROR]: Invalid operation")
    // => "Invalid operation"
    
public static String message(String logLine) {
    return logLine.split("]: ")[1].trim();
}
    
//LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"
public static String logLevel(String logLine) {
    return logLine.split("\\[")[1].split("\\]")[0].toLowerCase();
}

 //   LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"
    public static String reformat(String logLine) {
    return message(logLine) + " (" + logLevel(logLine) + ")";
}
}
