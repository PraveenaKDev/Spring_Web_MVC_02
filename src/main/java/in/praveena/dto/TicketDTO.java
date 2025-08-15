package in.praveena.dto;

import java.time.LocalDate;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TicketDTO {
	
	private long seqNo;
	
	private String name;
	
	private String email;
	
	private String fromPlace;
	
	private String toPlace;
	
	private LocalDate date_of_journey;
	
	private String trainNo;

}
