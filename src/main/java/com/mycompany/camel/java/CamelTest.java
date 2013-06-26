package com.mycompany.camel.java;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CamelContext context = new DefaultCamelContext();
		
		try {
		
			context.addRoutes(new RouteBuilder() {
				
				public void configure() {
					
					from("file:\\home\\ajit\\workspace\\camel-java\\src\\data\\inbox?noop=true").to("file:\\home\\ajit\\workspace\\camel-java\\src\\data\\outbox");
				}			
			});
				
			context.start();
			Thread.sleep(1000);
			context.stop();
		}	catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
