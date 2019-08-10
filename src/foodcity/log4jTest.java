/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
//import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

/**
 *
 * @author TED
 */
public class log4jTest {

    public static void initLogger() {
      try {
            String path = "‪logger.txt";
            PatternLayout layout = new PatternLayout("Log Without Error : User Name-"+log.empiun+"..........."+"Password :"+log.empipw+"    "+"%-10d %L %n");
            RollingFileAppender apender = new RollingFileAppender(layout, path);
            apender.setName("mylogsad8");
            apender.setMaxFileSize("1MB");
            apender.activateOptions();
            Logger.getRootLogger().addAppender(apender);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
