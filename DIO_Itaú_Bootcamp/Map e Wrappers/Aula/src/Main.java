import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map <String, User> users = new HashMap<>();
		users.put("Alemao", new User("Jorge", 44));
		users.put("Alemaozinho", new User("Jorginho", 45));
		users.put("Alemaozao", new User("Jorjao", 46));
		users.put("Alemaozento", new User("Jorgento", 47));
		System.out.println(users);
		System.out.println("====================");
		users.keySet().forEach(System.out::println);
		System.out.println("====================");
		users.values().forEach(System.out::println);
		
		System.out.println(users.containsKey("Alemaozeta"));
		System.out.println(users.containsValue(new User ("Jorge", 44)));
		
		users.merge("", new User("", -1), (user, user2) -> {
			System.out.println(user);
			System.out.println(user2);
			return user2;
		});
		System.out.println(users);
	}
}
