package it.connessione.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.connessione.Connessione;
import it.connessione.FaConnessione;




@Configuration
@ComponentScan(basePackageClasses = FaConnessione.class)


public class Config {
	@Bean
    public	Connessione getConnessione() throws ClassNotFoundException, SQLException {
		
		return new Connessione("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/gestione_surgelati2", "gennaro", "accardo", "SELECT nome_cliente,indirizzo,p_iva_cliente FROM cliente","INSERT INTO cliente (nome_cliente,indirizzo,p_iva_cliente,username,pazzword,verificato) VALUES ('francesco','pippo','ciao','ciao','due','1')");
	
		
    }
}	