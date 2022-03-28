package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_configuration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dri") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void passtheValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void selectbyDropdown(String type, WebElement element, String value) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("by Index")) {
				int i = Integer.parseInt(value);
				s.selectByIndex(i);
			} else if (type.equalsIgnoreCase("by Text")) {
				s.selectByVisibleText(value);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		driver.close();
	}

	public static String particular_data(String path, int row_index, int cell_index) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis); // up casting
		org.apache.poi.ss.usermodel.Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(cell_index);
		org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value = String.valueOf(val);

		}
		return value;

	}

}
