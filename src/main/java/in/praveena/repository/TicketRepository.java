package in.praveena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.praveena.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
