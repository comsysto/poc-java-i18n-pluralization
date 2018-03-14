package com.comsysto.i18n.poc;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);
        System.out.println(localeFromBuilder.getLanguage());
        // ResourceBundle
    }
}
