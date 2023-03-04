package ExceptionHandling;


class InSufficientBalance extends Exception{
	public InSufficientBalance(String str){
		super(str);
	}
}
public class Bank {
	int bal;

	public int getbal() {
		return bal;
	}

	public void setbal(int bal) {
		this.bal = bal;
	}
	public void withdraw(int a)
	{
		try
		{
			if(a>bal)
			throw new InSufficientBalance("Insufficient balanace");
			else
			
				bal=bal-a;
			
		}
		catch(InSufficientBalance e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.setbal(100);
		System.out.println(b.getbal());
		b.withdraw(120);
	}
}