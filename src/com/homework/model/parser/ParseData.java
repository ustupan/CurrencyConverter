package com.homework.model.parser;
import com.homework.model.Currency;

import java.util.Map;

public interface ParseData {
    Map<String, Currency> parse() throws Exception;
}
