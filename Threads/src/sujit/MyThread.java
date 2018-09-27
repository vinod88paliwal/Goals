package sujit;

public class MyThread implements Runnable {

	public String name;
	public int no;
	public ThreadExample1 ex;

	public MyThread(String name, int no, ThreadExample1 ex) {
		// super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.no = no;
		this.ex = ex;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (ex) {
			try {
				while (true) {
					
					while (ex.currTaskVal % 5 != no) {
						
						ex.wait();
					}

					if (ex.currTaskVal == 21) {
						break;
					} else if (this.no == 3 || this.no == 4 || this.no==5) {
						System.out.println("The Thread name - " + this.name + ": " + (char) (ex.greatChar));
						ex.greatChar = ex.greatChar + 1;
						 //ex.currTaskVal = ex.currTaskVal + 1;
						 ex.notifyAll();
					} 
					else {
						System.out.println("The Thread name - " + this.name + ": " + ex.currTaskVal);
						ex.currTaskVal = ex.currTaskVal + 1;
					
						ex.notifyAll();
					}
					//ex.notifyAll();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
}
