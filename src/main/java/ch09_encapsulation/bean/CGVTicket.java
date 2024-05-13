package ch09_encapsulation.bean;

public class CGVTicket {

	public static void main(String[] args) {
		CGV cgv = new CGV("홍대", "범죄도시", "2024-05-08", "L15");
		System.out.println("티켓번호: " + cgv.getTicketNum());
		System.out.println("극장명: " + cgv.getTheatre());
		System.out.println("영화명: " + cgv.getMovie());
		System.out.println("상영일시: " + cgv.getDate());
		System.out.println("좌석번호: " + cgv.getSeatNum());
	}

}
