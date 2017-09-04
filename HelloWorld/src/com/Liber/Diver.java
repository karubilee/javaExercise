package com.Liber;

public class Diver {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = 0xffffff;
		int color = car.color;
		System.out.println(car.color);

		// 字符串操作
		String name = "David";
		int age = 18;
		String hobby = "バスケットボール";
		String formatString = "我的名字是%s,我今年%d岁,我的爱好是%s \n";
		System.out.format(formatString, name, age, hobby);

		// static
		System.out.println(Post.getCount());
		Post post = new Post();

		// 泛型
		// 坐标为int类型,把int类型的包装类Integer作为参数传入泛型类中
		Point<Integer> point1 = new Point<Integer>();
		point1.setX(1);
		point1.setY(1);

		// 坐标为double类型,把double类型的包装类Double作为参数传入泛型类中
		Point<Double> point2 = new Point<Double>();
		point2.setX(3.456);
		point2.setY(4.414);
		System.out.println(point2.getX());

		Triple<String, Integer, Float> triple = new Triple<String, Integer, Float>();
		triple.setA("something");
		triple.setB(1);
		triple.setC(1.0f);

		// 泛型方法
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Character[] charArray = { 'T', 'I', 'A', 'N', 'M', 'A', 'Y', 'I', 'N', 'G' };
		Printer.printArray(intArray);
		Printer.printArray(charArray);

		// 异常
		// int x = 5 / 0;
		// System.out.println(x);
		// try catch
		// try {
		// int x = 5 / 0;
		// System.out.println(x);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("program is still running here~");
		//
		// try {
		// bar();
		// fun();
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("program is still running here!");

		// 获取包名和类名
		System.out.println(car.getClass().getName());
		// 获取类信息
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		try {
			class1 = Class.forName("com.Liber.Car");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		class2 = new Car().getClass();
		class3 = Car.class;
		System.out.println("类名称   " + class1.getName());
		System.out.println("类名称   " + class2.getName());
		System.out.println("类名称   " + class3.getName());

	}

	private static void fun() throws Exception {
		int x = 5 / 0;
		System.out.println(x);
	}

	private static void bar() throws BlogAppException {
		System.out.println("let's assume BlogAppException happened when executing `create` command");
		// 为了演示，这里我们假设执行create命令时，抛出了异常
		throw new BlogAppException("create");
	}
}
