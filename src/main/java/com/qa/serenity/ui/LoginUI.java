package com.qa.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target USERNAME_INPUT =
            Target.the("Campo para ingresar el nombre del usuario")
                    .locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target PWD_INPUT =
            Target.the("Campo para ingresar la contraseña del usuario")
                    .locatedBy("//input[@type='password']");

    public static final Target LOGIN_BTN =
            Target.the("Botón para iniciar sesión")
                    .locatedBy("//button[@id='LoginPanel0_LoginButton']");

    public static final Target ERROR_ALERT =
            Target.the("Alerta de error")
                    .locatedBy("//div[@id='toast-container']");
}
