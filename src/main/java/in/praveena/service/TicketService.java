package in.praveena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.praveena.entities.Ticket;
import in.praveena.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepo;
	
	public List<Ticket> getAllTickets() {
		List<Ticket> all = ticketRepo.findAll();
		System.out.println("list::::"+all);
		return all;
	}
}
