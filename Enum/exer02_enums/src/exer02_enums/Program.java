package exer02_enums;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) {
		LocalDateTime d01 = LocalDateTime.parse("2018-06-21T13:05:14");
		
		Comment c1 = new Comment ("Have a nice trip!");
		Comment c2 = new Comment ("Wow that's awesome");
		
		Post p1 = new Post(d01, "Travelling to New Zealand", 
				"I'm going to visit this wonderful country!",12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
	}
}
