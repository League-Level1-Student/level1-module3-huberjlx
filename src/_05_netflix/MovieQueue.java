package _05_netflix;

public class MovieQueue {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Twilight", 3);
		Movie movie2 = new Movie("Star Wars 4", 5);
		Movie movie3 = new Movie("6 Underground", 4);
		Movie movie4 = new Movie("The Meg", 2);
		Movie movie5 = new Movie("Logan", 1);
		
		System.out.println(movie1.getTicketPrice());
		System.out.println(movie2.getTicketPrice());
		System.out.println(movie3.getTicketPrice());
		System.out.println(movie4.getTicketPrice());
		System.out.println(movie5.getTicketPrice());
		
		NetflixQueue queue = new NetflixQueue();
			
			queue.addMovie(movie1);
			queue.addMovie(movie2);
			queue.addMovie(movie3);
			queue.addMovie(movie4);
			queue.addMovie(movie5);
			
			queue.printMovies();
			
			queue.sortMoviesByRating();
			
			queue.printMovies();
			
		
	}

}
