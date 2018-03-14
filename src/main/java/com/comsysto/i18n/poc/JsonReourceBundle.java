package com.comsysto.i18n.poc;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JsonReourceBundle extends ResourceBundle {

    // locale => Map<key,value>
    protected HashMap<String, LinkedTreeMap<String, String>> messages = new HashMap<>();

    Locale currentLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();

    JsonReourceBundle() throws IOException {
        messages.put("en", this.readJsonFileToHashMap("en"));
        messages.put("de", this.readJsonFileToHashMap("de"));
    }

    public void changeLocale(Locale newLocale) {
        this.currentLocale = newLocale;
    }

    private LinkedTreeMap<String, String> readJsonFileToHashMap(String locale) {
        BufferedReader jsonFileReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("i18n_" + locale + ".json")));
        JsonReader reader = new JsonReader(jsonFileReader);
        Gson gson = new Gson();
        return gson.fromJson(reader, Map.class);
    }

    public Object handleGetObject(String key) {
        String messageTranslated = messages.get(currentLocale.getLanguage()).get(key);
        if (messageTranslated != null) {
            return messageTranslated;
        }
        return null;
    }

    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }

    protected Set<String> handleKeySet() {
        return messages.get(this.currentLocale.getLanguage()).keySet();
    }
}

