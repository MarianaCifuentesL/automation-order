package com.qa.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewOrderUI {
    public static final Target COSTUMER_FIELD = Target.the("campo de cliente")
            .locatedBy("//span[@id='select2-chosen-8']");
    public static final Target COSTUMER_INPUT = Target.the("campo de cliente")
            .locatedBy("//input[@id='s2id_autogen8_search']");
    public static final Target COSTUMER_SELECTION = Target.the("campo de cliente")
            .locatedBy("//div[contains(@id,'select2-result-label') and contains(.,'Alfreds Futterkiste')]");
    public static final Target EMPLOYEE_FIELD = Target.the("campo de empleado")
            .locatedBy("//span[@id='select2-chosen-9']");
    public static final Target EMPLOYEE_INPUT = Target.the("campo de cliente")
            .locatedBy("//input[@id='s2id_autogen9_search']");
    public static final Target EMPLOYEE_SELECTION = Target.the("campo de empleado")
            .locatedBy("//div[contains(@id,'select2-result-label') and contains(.,'Laura Callahan')]");
    public static final Target ORDER_DATE_FIELD = Target.the("campo de fecha de pedido")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_OrderDialog19_OrderDate']");
    public static final Target DATE_BUTTON = Target.the("botón de fecha del datepicker")
            .locatedBy("//div[contains(@class,'OrderDate')]//button[contains(@class,'ui-datepicker-trigger')]");
    public static final Target TODAY_BUTTON = Target.the("botón hoy del datepicker")
            .locatedBy("//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')] \n" +
                    "//span[contains(@class,'flatpickr-day') and contains(@class,'today')]");

    public static final Target NEW_ORDER_DETAIL_BUTTON = Target.the("botón de nuevo detalle de pedido")
            .locatedBy("//div[contains(@id,'OrderDialog') and contains(@id,'DetailList')]//div[@data-action='add']");
    public static final Target SAVE_ORDER_BUTTON = Target.the("botón de guardar detalle de pedido")
            .locatedBy("    //div[contains(@id,'OrderDialog') and contains(@id,'Toolbar')]//div[@data-action='save-and-close']");


}
