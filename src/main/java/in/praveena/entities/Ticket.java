package in.praveena.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long seqNo;
	
	private String name;
	
	private String email;
	
	private String fromPlace;
	
	private String toPlace;
	
	
	private LocalDate date_of_journey;
	
	private String trainNo;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate makerDt;
	
	private String makerId;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate authDt;
	
	private String authId;
	
}
