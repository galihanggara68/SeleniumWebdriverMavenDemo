package com.sample.www;

import org.openqa.selenium.By;

public class MainPage {

    public static By btnSearch = By.xpath("//*[@id='root']/div[4]/div/div/div[3]/span");
    public static By txtSource = By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input");
    public static By txtDestination = By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[2]/div/div[2]/div/input");
    public static By txtDepartureCalendar = By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[3]/div/p[1]");
    public static By selectDate = By.xpath("(//div[@class='DayPicker-Day'])[18]");
}
