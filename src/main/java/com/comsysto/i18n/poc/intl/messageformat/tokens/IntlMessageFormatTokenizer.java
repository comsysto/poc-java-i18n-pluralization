package com.comsysto.i18n.poc.intl.messageformat.tokens;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntlMessageFormatTokenizer {

    /**
     * Raw Tokenize message
     *
     * INPUT: String
     *     "There \{foo\} {count, plural, =0{are} one{is} other{are}} {count} {count, plural, =0{cats} one{cat} other{cats}}"
     *
     * OUTPUT: Map<String, String>
     *     "plain" => "There \{foo\} "
     *     "plural" => "{count, plural, =0{are} one{is} other{are}}"
     *     "plain" => " "
     *     "singular" => "{count}"
     *     "plain" => " "
     *     "plural" => "{count, plural, =0{cats} one{cat} other{cats}}"
     *
     * @throws IntlMessageFormatTokenizerException On errors, if there is a Syntax Error like e.g. a Brace is not closed,
     * an Exception is thrown
     */
    public static Map<String, String> rawTokenizeMessage(String message) throws IntlMessageFormatTokenizerException {
        Map<String, String> rawTokens = new HashMap<>();

        //
        // FIXME: IMPLEMENT
        //
        return rawTokens;
    }
}
