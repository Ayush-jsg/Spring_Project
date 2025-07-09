package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.requset.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL = "http://localhost:9090/ticket";
	private String GET_TICKET_URL = "http://localhost:9090/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {

		WebClient webclient = WebClient.create();

		Ticket ticket = webclient.post().uri(BOOK_TICKET_URL).bodyValue(passenger).retrieve().bodyToMono(Ticket.class)
				.block();
		return ticket;
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> response =
		 * rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); Ticket ticket =
		 * response.getBody();
		 */

	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {

		WebClient webclient = WebClient.create();

		Ticket ticket = webclient.get().uri(GET_TICKET_URL, ticketNumber).retrieve().bodyToMono(Ticket.class).block();

		return ticket;

		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> response =
		 * rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber); Ticket ticket =
		 * response.getBody();
		 */

	}

}