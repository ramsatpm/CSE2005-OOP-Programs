class CallByValNRef
{
	int i;
	int j;
	CallByValNRef(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	void callByValue(int i,int j)
	{
		i=i*2;
		j=j/2;
		System.out.println("In Call By Value:---i: "+i+" j: "+j);
	}
	void callByReference(CallByValNRef d)
	{
		d.i=d.i*2;
		d.j=d.j/2;
		System.out.println("In Call By Reference:---d.i: "+d.i+" d.j:"+d.j);
	}
	public static void main(String ar[])
	{
		CallByValNRef cbvr = new CallByValNRef(20,40);
		CallByValNRef cbvr1 = new CallByValNRef(40,60);
		int k=20,l=40;

		System.out.println("Before Call By Value:---k: "+k+" l:"+l);
		cbvr.callByValue(k,l);
		System.out.println("After Call By Value:---k: "+k+" l:"+l);
		System.out.println();

		System.out.println("Before Call By Reference:---cbvr1.i: "+cbvr1.i+" cbvr1.j:"+cbvr1.j);
		cbvr.callByReference(cbvr1);
		System.out.println("After Call By Reference:---cbvr1.i: "+cbvr1.i+" cbvr1.j:"+cbvr1.j);
	}
}