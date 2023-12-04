package com.my.movie;

import java.util.ArrayList ;
import java.util.List ;


public class MovieMgr {
	private List<Movie> movies ;
	
	public MovieMgr() {
		this.movies = new ArrayList<>() ;
	}
	
	public void add(Movie m) {
		movies.add(m) ;
	}
	
	public void search() {
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
	
	public void search(String title) {
		for (Movie movie : movies) {
			if (movie.getTitle().equals(title) || movie.getTitle().contains(title)) {
				System.out.println(movie);
				return;
			}
		}
		System.out.println("해당 제목의 영화를 찾을 수 없습니다.");
	}
	
	public void searchDirector(String name) 
	{
		for (Movie movie : movies) {
			if (movie.getDirector().equals(name) || movie.getDirector().contains(name)) {
				System.out.println(movie);
			}
		}
	}
	
	public List<Movie> searchGenre(String genre) 
	{
		List<Movie> foundMovies = new ArrayList<>() ;
		for (Movie movie : movies) {
			if (movie.getGenre().equals(genre) || movie.getGenre().contains(genre)) {
				foundMovies.add(movie) ;
			}
		}
		return foundMovies;
	}
	
	public void delete(String title) {
		movies.removeIf(movie -> movie.getTitle().equals(title)) ;
	}
	
}
