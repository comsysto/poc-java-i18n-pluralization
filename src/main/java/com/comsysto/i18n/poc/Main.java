package com.comsysto.i18n.poc;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);
        System.out.println(localeFromBuilder.getLanguage());

        // See:
        //  - https://docs.oracle.com/javase/tutorial/i18n/format/messageFormat.html
        // - https://docs.oracle.com/javase/tutorial/i18n/format/choiceFormat.html
        JsonReourceBundle messages = new JsonReourceBundle();

        messages.changeLocale(new Locale.Builder().setLanguage("en").setRegion("US").build());
        System.out.println(messages.getString("pluralizationDemo.hello"));

        messages.changeLocale(new Locale.Builder().setLanguage("de").setRegion("DE").build());
        System.out.println(messages.getString("pluralizationDemo.hello"));
    }
}
