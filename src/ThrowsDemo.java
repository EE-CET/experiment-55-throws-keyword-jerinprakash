import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    
    // TODO: Define static method check(int n) that throws IOException
    // If n < 0, throw new IOException()
    // Else, print n

	static void check(int n) throws IOException{

		if(n<0){

			throw new IOException();

		}
		else{

			System.out.println(n);

		}

	}
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();

		try{

			check(n);

		}
		catch(IOException e){

			System.out.println("Caught: IO Exception");
		}
	}
   
        // TODO: Read n
        
        // TODO: try {
        //     call check(n)
        // } catch (IOException e) {
        //     Print "Caught: IO Exception"
        // }
    
}
