package com.qa.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewOrderDetailUI {
    public static final Target PRODUCT_FIELD = Target.the("campo de producto")
            .locatedBy("//div[@id='s2id_Serenity_Demo_Northwind_OrderDetailDialog38_ProductID']");
    public static final Target PRODUCT_INPUT = Target.the("campo de producto")
            .locatedBy("//div[@id='select2-drop']//input[contains(@class,'select2-input')]");
    public static final Target PRODUCT_SELECTION  = Target.the("campo de producto")
            .locatedBy("//div[@id='select2-drop']//div[contains(@class,'select2-result-label') and contains(.,'Chai')]");
    public static final Target UNIT_PRICE_FIELD = Target.the("Campo de precio unitario del producto")
            .locatedBy("//input[@name='UnitPrice']");
    public static final Target QUANTITY_FIELD = Target.the("Campo de precio unitario del producto")
            .locatedBy("//input[@name='Quantity']");
    public static final Target SAVE_ORDER_DETAIL_BUTTON = Target.the("botón de guardar detalle de pedido")
            .locatedBy("//div[contains(@id,'OrderDetailDialog') and contains(@id,'Toolbar')]//div[@data-action='save-and-close']");
}
