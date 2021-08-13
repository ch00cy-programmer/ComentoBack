package com.devfun.vo;

public class MovieVO {
	private String movie_name;
	private String director;
	private String type;
	
	public MovieVO(String movie_name, String director, String type) {
		super();
		this.movie_name = movie_name;
		this.director = director;
		this.type = type;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
