package com.comsysto.i18n.poc.intl.messageformat.params;

import java.util.Date;
import java.util.Locale;

public class IntlMessageFormatDateParam extends Date implements IntlMessageFormatParam {

    public String format(Locale locale) {
        return this.format(locale);
    }
}
