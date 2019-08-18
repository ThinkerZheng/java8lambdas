package lambdaExample;

public class RunnableExmaple {
	
	private Runnable runnable = () -> {
		String threadName = Thread.currentThread().getName();
		for(int i = 0 ;i < 100; i++)
			System.out.println(threadName + "test" + i);
		};
	
	public void testRunnable() {
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}

}
