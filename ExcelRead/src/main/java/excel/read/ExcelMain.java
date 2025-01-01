package excel.read;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
			String name =Excel.readStringData(2,0);
			System.out.println("Name :"+ "\t"+name);
			String id= Excel.readIntegerData(1, 1);
			System.out.println("id :"+"\t"+ id);
	}

}
