package fileWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeWork {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Employee em = new Employee(101L, "Ritik", 29, 90000.78, "IT");
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employee.ser"));
		os.writeObject(em);
		os.close();

	}
}
