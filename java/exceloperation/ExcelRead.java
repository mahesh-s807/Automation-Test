package exceloperation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
	XSSFSheet sh;
public ExcelRead()throws IOException{
FileInputStream  f= new FileInputStream("C:\\Users\\WIN 10\\Desktop\\New folder\\test.xlsx");
XSSFWorkbook w=new XSSFWorkbook(f);
sh=w.getSheet("sheet1");

}
	/*public double readData(int i,int j)
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		double data=c.getNumericCellValue();
		return data;
	}*/
public int rowsize() {
	int noOfRows=sh.getLastRowNum()+1;
	return noOfRows;
}

public String readData(int i, int j) {
	Row r= sh.getRow(i);
	Cell c= r.getCell(j); //Import Cell of apache poi not Table
	int celltype=c.getCellType();
	//System.out.println("cellltype="+celltype);
/*	 numeric -0
 string -1*/
	switch(celltype) 
	{
	case Cell.CELL_TYPE_NUMERIC:
	{
		double a=c.getNumericCellValue();
		return String.valueOf(a);
	}
	case Cell.CELL_TYPE_STRING:
	{
		return c.getStringCellValue();
	}
        }
	return null; 
}

}