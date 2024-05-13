package ch09_encapsulation.bean;

import java.util.UUID;

public class CGV {
	private String ticketNum;
	private String theatre;
	private String movie;
	private String date;
	private String seatNum;

	public CGV(String theatre, String movie, String date, String seatNum) {
		UUID uuid4 = UUID.randomUUID();
		setTicketNum(uuid4.toString());
		setTheatre(theatre);
		setMovie(movie);
		setDate(date);
		setSeatNum(seatNum);
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getTheatre() {
		return theatre;
	}

	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

}
