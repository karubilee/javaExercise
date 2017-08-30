package com.Liber;

public class Diver {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = 0xffffff;
		int color = car.color;
		System.out.println(car.color);
		
		
		//字符串操作
		String name = "David";
		int age = 18;
		String hobby = "バスケットボール";
		String formatString = "我的名字是%s,我今年%d岁,我的爱好是%s \n";
		System.out.format(formatString, name, age, hobby);
		
		
		//static 
		System.out.println(Post.getCount());
		Post post = new Post();
		
		//泛型
		//坐标为int类型,把int类型的包装类Integer作为参数传入泛型类中
		Point<Integer> point1 = new Point<Integer>();
		point1.setX(1);
		point1.setY(1);
		
		//坐标为double类型,把double类型的包装类Double作为参数传入泛型类中
		Point<Double> point2 = new Point<Double>();
		point2.setX(3.456);
		point2.setY(4.414);
		System.out.println(point2.getX());
		
		Triple<String, Integer, Float> triple = new Triple<String, Integer, Float>();
		triple.setA("something");
		triple.setB(1);
		triple.setC(1.0f);
	}
}
