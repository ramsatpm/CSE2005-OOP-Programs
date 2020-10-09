class BoxDemo2
{
	public static void main(String args[])
	{
		int i,j;
		//creating an array of ten reference variables
		Box b[]=new Box[10];
		//Making array of ref variables into objects
		for(i=0;i<10;i++)
		{
			b[i]=new Box();
		}
		for(i=0;i<10;i++)
		{
			j=i+1;
			b[i].setData(j,j,j);
		}
		for(i=0;i<10;i++)
		{
			System.out.println("The Volume of Box b["+i+"]: "+b[i].volume());
		}
	}
}