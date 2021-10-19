package lab1.lab1_3.git.src.main.java.com.ies;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class App 
{

    private static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
