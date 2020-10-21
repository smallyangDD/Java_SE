package com.wsdaoy.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 导入Excel文件（支持“XLS”和“XLSX”格式）
 */
public class ExcelUtil {

    /**
     * 从第一行有标题的信息读取excel
     *
     */
    public static Workbook getImportExcel(String filePath) throws InvalidFormatException, IOException{
        File file=new File(filePath);
        if(null==file || !file.exists()) {
            throw new RuntimeException("文档不存在!");
        }
        InputStream is= new FileInputStream(file);
        String fileName = file.getName();
        Workbook wb = null;

        if (StringUtils.isBlank(fileName)){
            throw new RuntimeException("导入文档为空!");
        }else if(fileName.toLowerCase().endsWith("xls")){
            wb = new HSSFWorkbook(is);
        }else if(fileName.toLowerCase().endsWith("xlsx")){
            wb = new XSSFWorkbook(is);
        }else{
            throw new RuntimeException("文档格式不正确!");
        }
        if (wb.getNumberOfSheets() < 0){
            throw new RuntimeException("文档中没有工作表!");
        }
        //读完文件流之后关闭输入流
        is.close();
        return wb;
    }

    /**
     * 获取单元格值
     * @param row 获取的行
     * @param column 获取单元格列号
     * @return 单元格值
     */
    public static String getStringCellValue(Row row, int column){
        String val = "";
        try{
            Cell cell = row.getCell(column);
            if (cell != null){
                cell.setCellType(Cell.CELL_TYPE_STRING);
                val = cell.getStringCellValue();
            }
        }catch (Exception ignored) {

        }
        return val;
    }


}
