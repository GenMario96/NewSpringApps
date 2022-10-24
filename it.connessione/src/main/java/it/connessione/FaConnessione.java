package it.connessione;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class FaConnessione {

	
	Connessione connessione = new Connessione();
	
	
}
