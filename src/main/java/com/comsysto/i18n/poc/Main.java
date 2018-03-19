package com.comsysto.i18n.poc;

import java.io.IOException;
import com.ibm.icu.text.MessageFormat;
import com.ibm.icu.util.ULocale;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
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

        // TODO
        // USE ICU MessageFormat => http://icu-project.org/apiref/icu4j/com/ibm/icu/text/MessageFormat.html

        MessageFormat msgFmt = new MessageFormat(
                "{num_files, plural, " +
                        "=0{There are no files on disk \"{disk_name}\".}" +
                        "=1{There is one file on disk \"{disk_name}\".}" +
                        "other{There are # files on disk \"{disk_name}\".}}",
                ULocale.ENGLISH);
        Map<String, Object> messageArgs = new HashMap<>();
        messageArgs.put("num_files", 0);
        messageArgs.put("disk_name", "MyDisk");
        System.out.println(msgFmt.format(messageArgs));
        messageArgs.put("num_files", 3);
        System.out.println(msgFmt.format(messageArgs));

    }
}
