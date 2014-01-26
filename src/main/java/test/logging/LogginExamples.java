package test.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginExamples {
    private static final Logger logger=Logger.getLogger(LogginExamples.class.getName());
    public void doIt(){
        logger.entering(getClass().getName(), "doIt");
        try{
            /*any thing may happen here*/
            logger.logp(Level.SEVERE, "logging.LoggingExamples", "main",
                    "resources.myresources {0}", "value of key1");
            logger.logrb(Level.SEVERE, "logging.LoggingExamples", "main",
                    "resources.myresources", "key1");
        }catch(Exception e){
            logger.log(Level.SEVERE,"Error doging XYZ",e);
        }
        logger.exiting(getClass().getName(), "doIt");
    }
    public static void main(String argvs[]){
        LogginExamples le=new LogginExamples();
        le.doIt();
    }
}
