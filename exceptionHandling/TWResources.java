import java.io.*;
class TWResources
{
	static void printFile(String fileName) throws IOException
	{
		try(FileInputStream input = new FileInputStream(fileName))
		{
			int data = input.read();
	        while(data != -1)
	        {
	            System.out.print((char) data);
	            data = input.read();
	        }
		}
	}
	static void printFileWithBuffer(String fileName) throws IOException
	{
		try(  FileInputStream     input         = new FileInputStream(fileName);
          BufferedInputStream bufferedInput = new BufferedInputStream(input) )
		{

	        int data = bufferedInput.read();
	        while(data != -1)
	        {
	            System.out.print((char) data);
	            data = bufferedInput.read();
        	}
    	}
	}
	public static void main(String args[])
	{
		try
		{
			printFile(args[0]);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		// try
		// {
		// 	printFileWithBuffer(args[0]);
		// }
		// catch(IOException e)
		// {
		// 	System.out.println(e.getMessage());
		// }
	}
}

// private static void printFile() throws IOException {
//     FileInputStream input = new FileInputStream("file.txt");
//     try(input) {

//         int data = input.read();
//         while(data != -1){
//             System.out.print((char) data);
//             data = input.read();
//         }
//     }
// }