package com.Liber;

public class Post {
	String title; 
	String content;
	
	private static int count = 0;
	
	void print() {
		System.out.println("title is" + title);
		System.out.println("content is " + content);
	}
	static {
		count = 100; //假设数据库来的
	}
	public Post() {
		++count;
		System.out.println("haha");
	}
	public static int getCount() {
		return count;
	}
}
