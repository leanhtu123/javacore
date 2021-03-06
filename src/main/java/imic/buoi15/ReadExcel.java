
package imic.buoi15;



import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Iterator;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {



    public static void main(String[] args) {

        File excelFile = new File("src\\main\\resources\\imic\\anhtu.xlsx");

        //FileInputStream fis = new FileInputStream(excelFile);
        File inputfile = new File(CopyFile.class.getClassLoader().getResource("imic/anhtu.xlsx").getFile()) ;



        // we create an XSSF Workbook object for our XLSX Excel File

        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputfile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

        // we get first sheet

        XSSFSheet sheet = workbook.getSheetAt(0);



        // we iterate on rows

        Iterator<Row> rowIt = sheet.iterator();



        while(rowIt.hasNext()) {

            Row row = rowIt.next();



            // iterate on cells for the current row

            Iterator<Cell> cellIterator = row.cellIterator();



            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                System.out.print(cell.toString() + ";");

            }



            System.out.println();

        }


        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
