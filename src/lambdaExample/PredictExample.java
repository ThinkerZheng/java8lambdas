package lambdaExample;

import java.util.function.Predicate;

public class PredictExample {
	private Predicate<User> isAdult = (user)->user.getAge() >18;
	private Predicate<User> isAdaultMale = isAdult.and((user)-> user.getGender().equalsIgnoreCase("Male") || user.getGender().equalsIgnoreCase("M"));

	public void testPredicate() {
		User guangbin = new User();
		guangbin.setName("Guangbin");
		guangbin.setAge(17);
		guangbin.setGender("M");
		guangbin.setNation("China");
		guangbin.setEmail("guangbin@foxmail.com");
		
		User changwoo = new User();
		changwoo.setName("창우");
		changwoo.setAge(20);
		changwoo.setGender("M");
		changwoo.setNation("South Korea");
		changwoo.setEmail("changwoo@naver.com");
		
		isAdultMale(guangbin);
		isAdultMale(changwoo);
		
	}
	
	private void isAdultMale(User user) {
		if(isAdaultMale.test(user)) {
			System.out.print(user.getName() + " is adult male");
		}
	}
	 
}
