package com.Liber;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class PostRepository {
	private static Map<Long,Post> postsMap = new HashMap<Long,Post>();
	public static void add(Post post) {
		postsMap.put(post.getId(), post);
	}
	
	public static Post getPostById(long id ) {
		return postsMap.get(id);
	}
	
	public static void remove(long id) {
		postsMap.remove(id);
	}
	
	public static List<Post> getAll() {
        List<Post> posts = new ArrayList<>();
        posts.addAll(postsMap.values());
        return posts;
    }
	
//	在Java 7和Java 8中，编译器能够根据变量声明时的泛型类型自动推断出实例化所用的泛型类型。
//
//	ArrayList<Post> post1 = new ArrayList<Post>();
//	ArrayList<Post> post2 = new ArrayList<>();
}
