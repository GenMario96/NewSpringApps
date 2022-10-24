package it.connessione;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor
public class Connessione {

	/*
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost/gestione_surgelati2";
	  static final String USER = "Gennaro";
	  static final String PASS = "Accardo";
	
	  
	  */
	
	String query;
int scelta =2;
	
	public Connessione(String JDBC_DRIVER, String DB_URL, String USER, String PASS,String sql,String sqli) {
	Statement stmt = null;	
    Connection connessione = null;
	    
    Scanner s = new Scanner(System.in);
    
    	setQuery(query);
    
	    try {
	      Class.forName(JDBC_DRIVER);
	      connessione = DriverManager.getConnection(DB_URL, USER, PASS);
	      
	      if (connessione != null) 
	      {
	        System.out.println("Connessione al db effettuata");
	        
	        if(scelta==1)
	        {
	            stmt = connessione.createStatement(); 
	 	       
	      		System.out.println(sql);
	      		ResultSet rs = stmt.executeQuery(sql);
	      		while (rs.next()) {
			          String nome = rs.getString("nome_cliente");
			          String indirizzo = rs.getString("indirizzo");
			          String p_iva = rs.getString("p_iva_cliente");
			        

			          System.out.print("Nome " + nome);
			          System.out.print(", Indirizzo: " + indirizzo);
			          System.out.print(", partita iva: " + p_iva);
			     
	        }
	      		
		        }
		           
	        		
	        if(scelta==2)
	        {
	        	
	            stmt = connessione.createStatement(); 
		 	       
	      		System.out.println(sql);
	      		stmt.executeUpdate(sqli);
	        	
	        	
	      		
	        }
	        
	    
	      }
	    
	    } catch (SQLException se) {
	      se.printStackTrace();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      try {
	    	  connessione.close();
	      } catch (SQLException se) {
	        se.printStackTrace();
	      }
	      
	    }
	  
}


	private void setQuery(String query) {
		
		
		this.query=query;
		
	}



}
