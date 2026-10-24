package realWorldExample;

public class MovieTheater {
	private int tickets = 5;

	public synchronized void bookTicket() {
		tickets--;
	}

	public synchronized int avilableTickets() {
		return tickets;
	}
}

class Person extends Thread{
	private String name;
	private MovieTheater theater;
	
	public Person(String name, MovieTheater theater) {
		this.name = name;
		this.theater = theater;
	}
	
	@Override
	public void run() {
		if(theater.avilableTickets() > 0) {
			System.out.println("=======================");
			theater.bookTicket();
			System.out.println("Ticket booked successfully..  : " + name);
			System.out.println("===========================");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Tickets are not available... : " +  name);
		}
	}
	
}
