
package com.qa.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.qa.serenity.ui.HomeUI.DASHBOARD_VIEW;

public class DashboardVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DASHBOARD_VIEW.resolveFor(actor).isVisible();
    }

    public static DashboardVisible isVisible() {
        return new DashboardVisible();
    }
}