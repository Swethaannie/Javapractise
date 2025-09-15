package excelRead;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s=Excelcode.readStringData(1, 0);
		System.out.println(s);
		String s1=Excelcode.readIntegerData(1, 1);
		System.out.println(s1);
		

	}

}