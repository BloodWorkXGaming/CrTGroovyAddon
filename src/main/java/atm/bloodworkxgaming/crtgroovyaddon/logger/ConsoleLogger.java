package atm.bloodworkxgaming.crtgroovyaddon.logger;

import atm.bloodworkxgaming.crtgroovyaddon.CrTGroovyAddon;
import atm.bloodworkxgaming.crtgroovyaddon.commands.ChatHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsoleLogger implements ILogger{
    public static final Logger logger = LogManager.getLogger(CrTGroovyAddon.MODID);

    @Override
    public void logCommand(String message) {
        logger.info(ChatHelper.removeFormattingCodes(message));
    }

    @Override
    public void logInfo(String message) {
        logger.info(ChatHelper.removeFormattingCodes(message));
    }

    @Override
    public void logWarning(String message) {
        logger.warn(ChatHelper.removeFormattingCodes(message));
    }

    @Override
    public void logError(String message) {
        logError(ChatHelper.removeFormattingCodes(message), null);
    }

    @Override
    public void logError(String message, Throwable exception) {
        if (exception == null){
            logger.error(ChatHelper.removeFormattingCodes(message));
        }else {
            logger.error(ChatHelper.removeFormattingCodes(message), exception);
        }
    }
}
