
public class Add {
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void sum(int x, int y, int z)
	{
		int v= x+y+z;
		System.out.println(v);
	}
	public void sum(double m,double n)
	{
		double l = m+n;
		System.out.println(l);
	}

	public static void main(String[] args) {
	Add ob = new Add();
	ob.sum(5, 6);
	ob.sum(10,11,12);
	ob.sum(2.444, 4.222);
	

	}

}
