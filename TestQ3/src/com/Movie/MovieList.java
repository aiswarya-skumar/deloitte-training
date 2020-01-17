package com.Movie;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class MovieList {
	List<Movie> movieList=new ArrayList<>();
	
	public static void main(String[] args) {
		//List<Movie> movieList=new ArrayList<>();
		new MovieList();
	}
	
	MovieList()
	{
		
	}
	public void inputData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your show date");
		String date=sc.next();
		System.out.println("Enter your show time");
		String time=sc.next();
		System.out.println("Enter your show status");
		String status=sc.next();
		movieList.add(id,name,date,time,status);
		
		
	}

}
