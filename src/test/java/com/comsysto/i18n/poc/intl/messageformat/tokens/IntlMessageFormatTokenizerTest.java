package com.comsysto.i18n.poc.intl.messageformat.tokens;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntlMessageFormatTokenizerTest {


    @Test
    public void testTokenize() throws IntlMessageFormatTokenizerException {
        Map<String, String> tokens = IntlMessageFormatTokenizer.rawTokenizeMessage("There \\{foo\\} {count, plural, =0{are} one{is} other{are}} {count} {count, plural, =0{cats} one{cat} other{cats}}");
        // https://www.mkyong.com/unittest/junit-how-to-test-a-map/
        Map<String, String> expected = new HashMap<>();
        expected.put("plain", "There \\{foo\\} ");
        expected.put("plural", "{count, plural, =0{are} one{is} other{are}}");
        expected.put("plain", " ");
        expected.put("singular", "{count}");
        expected.put("plain", " ");
        expected.put("plural", "{count, plural, =0{cats} one{cat} other{cats}}");
        assertThat(tokens, is(expected));
    }
}
