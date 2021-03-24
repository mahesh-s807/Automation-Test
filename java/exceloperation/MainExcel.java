package exceloperation;

import java.io.IOException;

public class MainExcel {
public static void main(String args[])throws IOException{

	ExcelRead ob=new ExcelRead();
	//String a=ob.readData(0,1);
	//System.out.println("vale of a is "+a);
	for(int i=0;i<ob.rowsize();i++) {
		  for(int j=0;j<2;j++) {
			String a=ob.readData(i,j);
	        System.out.println("Value of cell("+i+","+j+") is "+a);
		  }
		}

}
}