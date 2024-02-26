package core.logging;

import java.util.List;

public class LoggingHelper {
    public static void log(List<BaseLogger> loggers, String data) {
        for (BaseLogger logger : loggers) {
            logger.log(data);
        }
    }
}
