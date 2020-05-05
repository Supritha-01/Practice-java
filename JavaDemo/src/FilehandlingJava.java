import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilehandlingJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Creating file
//    try{File obj=new File("Filename.txt");
//    if(obj.createNewFile()){
//    	
//    	System.out.println("File is created :" + obj.getName());
//    }else {
//    	System.out.println("File already exists ");
//    }}
//    catch(IOException e) {
//    	System.out.println("An error occured");
//    	e.printStackTrace();
//    }

		// Writing to files

//		try {
//			FileWriter myWriter = new FileWriter("filename.txt");
//			myWriter.write("Files in Java might be tricky, but it is fun enough!");
//			myWriter.close();
//			System.out.println("Successfully wrote to the file.");
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//
//		}

		//Read files
//		try{File myRead=new File("filename.txt");
//		Scanner obj=new Scanner(myRead);
//		while(obj.hasNextLine()) {
//			System.out.println(obj.nextLine());
//		}
//		obj.close();
//		}
//		catch (FileNotFoundException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//			
//			
//		}
		
		// get information about files
//		File obj=new File("Filename.txt");
//		if(obj.exists()) {
//			
//			System.out.println("FileName :" + obj.getName());
//			System.out.println("Path :" + obj.getAbsolutePath());
//			System.out.println("Writeable :" + obj.canWrite());
//			System.out.println("Writeable :" + obj.canWrite());
//			System.out.println("File size in bytes :" + obj.length());
//		}
		
		// Deleting files
		
		File obj=new File("Filename.txt");
		if(obj.delete()) {
			
			System.out.println("File is deleted :" + obj.getName());
		}else {
			System.out.println("Failed to delete file");
		}
		}
	}
