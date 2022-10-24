package it.connessione;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.connessione.config.Config;




public class Main {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		FaConnessione connessione = context.getBean(FaConnessione.class);
		
		//System.out.println(connessione);
		

	}

}
