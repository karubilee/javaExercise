package com.Liber;

import java.lang.reflect.Constructor;
import java.sql.Date;
import java.time.*;
public class Diver {
	public static void main(String[] args) throws Exception {
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

		// 实例化类对象
		try {
			Class<?> class4 = Class.forName("com.Liber.User");
			// 第一种方法,这会调用类的默认构造方法;
			User user = (User) class4.newInstance();
			user.setAge(20);
			user.setName("Liber");
			System.out.println(user);

			// 第二种方法,先取得全部构造函数,然后使用构造函数创建对象
			Constructor<?> cons[] = class4.getConstructors();
			for (int i = 0; i < cons.length; i++) {
				// 查看每个构造方法需要的参数
				Class<?> clazzs[] = cons[i].getParameterTypes();

				// 打印构造函数的签名
				System.out.print("cons[" + i + "] (");
				for (int j = 0; j < clazzs.length; j++) {
					if (j == clazzs.length - 1)
						System.out.print(clazzs[j].getName());
					else
						System.out.print(clazzs[j].getName() + ",");
				}
				System.out.println(")");
			}
			// 调用构造函数
			user = (User) cons[0].newInstance(20, "tianmaying");
	        System.out.println(user);
			user = (User) cons[1].newInstance("tianmaying");
			System.out.println(user);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//日期处理
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);
		
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
