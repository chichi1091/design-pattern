package com.design_pattern.interpreter;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.StringTokenizer;

public class Context {
    private StringTokenizer tokenizer;
    @Getter
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if(tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    @SneakyThrows
    public void skipToken(String token) {
        if(!token.equals(currentToken)) {
            throw new ParseException("Waring:" + token + " is wxpected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    @SneakyThrows
    public int currentNumber() {
        return Integer.parseInt(currentToken);
    }
}
