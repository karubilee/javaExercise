package com.Liber;

import java.util.Scanner;

public class HelloWorld {  
    
    public static void main(String[] args) {
        System.out.println("HelloWorld！");
        Post post = new Post();
        post.title = "lb exercise";
        post.content = "let's learn Java";
        post.print();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        scan.close();
    }
}
