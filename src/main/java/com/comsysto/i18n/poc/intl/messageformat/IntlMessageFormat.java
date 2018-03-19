package com.comsysto.i18n.poc.intl.messageformat;

import com.comsysto.i18n.poc.intl.messageformat.params.IntlMessageFormatParam;

import java.util.Locale;
import java.util.Map;

/*
 * This is a Proof of Concept Implementation of Intl MessageFormat in Java
 *
 * https://github.com/yahoo/intl-messageformat
 * https://formatjs.io/
 */
public class IntlMessageFormat {

    private String message;
    private Locale locale;

    IntlMessageFormat(String message, Locale locale) {
        this.message = message;
        this.locale = locale;
    }

    public String format(Map<String, IntlMessageFormatParam> params) {
        // FIXME
        return this.message;
    }

    protected String replaceSimpleOccurences(Map<String, IntlMessageFormatParam> params) {
        // FIXME
        return this.message;
    }

}
