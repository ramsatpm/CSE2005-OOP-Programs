class Box
{
	int w;
	int h;
	int d;
	Box()
	{
		w=h=d=1;
	}
	Box(int whd)
	{
		w=h=d=whd;
	}
	Box (int w,int h,int d)
	{
		setW(w);
		setH(h);
		setD(d);
		// this.w=w;
		// this.h=h;
		// this.d=d;
	}
	Box(Box ob)
	{
		w=ob.w;
		h=ob.h;
		d=ob.d;
	}
	int getW()
	{
		return w;
	}
	int getH()
	{
		return h;
	}
	int getD()
	{
		return d;
	}
	void setW(int width)
	{
		w=width;
	}
	void setH(int height)
	{
		h=height;
	}
	void setD(int depth)
	{
		d=depth;
	}
	int volume()
	{
		int vol;
		vol= getW() * getD() * getH();
		return vol;
	}

	Box getClone()
	{
		Box temp = new Box();
		temp.w=w; // or temp.w = this.w;
		temp.h=h;
		temp.d=d;
		return temp;
	}

	boolean equals(Box b)
	{
		if(w==b.w && h==b.h && d==b.d)
			return true;
		else
			return false;
	}

	// public String toString()
	// {
	// 	String OutStr;
	// 	OutStr = "The Width is: "+w+" Height is: "+h+" and Depth is: "+d;
	// 	return OutStr;
	// }
	
}
class BoxDemo
{
	public static void main(String args[])
	{
		// Box b1 = new Box(10,20,10);
		// Box b2 = new Box(15,20,15);

		Box b3 = new Box(20);
		Box b5 = b3;
		Box b6 = new Box(b3);

		Box b7 = b3.getClone();

		Box b4 = new Box(20);

		int i=10,j=10;
		double d=23.4;

		// System.out.println(i);
		// System.out.println(d);

		// System.out.println(b1);
		// System.out.println(b2);
		System.out.println(b3);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);

		// if(i==j)
		// {
		// 	System.out.println("They are same");
		// }
		// else
		// {
		// 	System.out.println("they are not same");
		// }
		// if(b3==b4)
		// {
		// 	System.out.println("They are same");
		// }
		// else
		// {
		// 	System.out.println("they are not same");
		// }
		// if(b3.equals(b4))
		// 	System.out.println("The Both Objects values are same, so they are same");
		// else
		// 	System.out.println("The Both objects values are different, so they are not same");

		//b1.setData(10,20,10);
		//b2.setData(15,20,15);

		// b1.w=10;
		// b1.h=20;
		// b1.d=10;

		// b2.w=15;
		// b2.h=20;
		// b2.d=15;

		// System.out.println("The Volume of b1 box is:"+b1.volume());
		// System.out.println("The Volume of b2 box is:"+b2.volume());
		
		}
}