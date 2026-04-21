package com.qa.serenity.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target DASHBOARD_VIEW =
            Target.the("Dashboard")
                    .locatedBy("//div[@id='DashboardContent']");

    public static final Target STARTSHARP_MENU = Target.the("Toggle navigation")
            .located(By.xpath("//button[@id='s-sidebar-toggler']"));

    public static final Target NORTHWIND_MENU = Target.the("menu northwind")
            .located(By.xpath("//a[@href='#nav_menu1_2_1']"));

    public static final Target ORDERS_OPTION = Target.the("orders option")
            .located(By.xpath("//a[@href='/Northwind/Order']"));

}
