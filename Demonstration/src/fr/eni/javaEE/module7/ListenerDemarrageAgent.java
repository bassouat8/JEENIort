package fr.eni.javaEE.module7;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerDemarrageAgent
 *
 */
@WebListener
public class ListenerDemarrageAgent implements ServletContextListener {
	private static Date dateDemarrage;
	

	public static Date getDateDemarrage() {
		return dateDemarrage;
	}

public void contextDestroyed(ServletContextEvent sce)  { 
System.out.println("Arrêt de l'application");
}

public void contextInitialized(ServletContextEvent sce)  { 
System.out.println("Démarrage de l'application");
ListenerDemarrageAgent.dateDemarrage=new Date();
}


    /**
     * Default constructor. 
     */
    public ListenerDemarrageAgent() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    
	
}
