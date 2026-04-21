package com.qa.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrdersUI {
    public static final Target NEW_ORDER_BUTTON = Target.the("botón de nueva orden")
            .locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target RECENT_ORDER_ROW = Target.the("registro más reciente de la tabla de pedidos")
            .locatedBy("(//div[contains(@class,'slick-row') and @data-row='0'])");
    public static final Target RECENT_ORDER_CUSTOMER = Target.the("cliente del registro más reciente")
            .locatedBy("//div[@data-row='0']//div[contains(@class,'l2')]//a");
    public static final Target RECENT_ORDER_DATE = Target.the("fecha del registro más reciente")
            .locatedBy("//div[@data-row='0']//div[contains(@class,'l3')]//a");
    public static final Target RECENT_ORDER_EMPLOYEE = Target.the("empleado del registro más reciente")
            .locatedBy("//div[contains(@class,'sg-main')]//div[@data-row='0']//div[.//i]");

}
