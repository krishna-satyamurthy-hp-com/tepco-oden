/**
 * 
 */
package com.hp.proserv.mo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interwoven.wcm.lscs.Client;

/**
 * @author krishkri
 *
 */
public class LSCSServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context;
		try{
			context = new ClassPathXmlApplicationContext("context.xml");			
			
			LSCSClientFactory lscsClientFactory = (LSCSClientFactory) context.getBean("lscsClientFactory");
			System.out.println("lscs host "+lscsClientFactory.getLscsConnectionProperties().getProperty("lscs.host"));
			
			final Client lscsClient = lscsClientFactory.getLSCSClient();
			System.out.println("lscs client "+lscsClient);
			System.out.println("Available LSCS Projects");
			System.out.println(lscsClient.getAllProjects());
			System.out.println("These changes are made by Masaru");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
