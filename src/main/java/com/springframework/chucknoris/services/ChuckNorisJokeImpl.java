package com.springframework.chucknoris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokeImpl implements ChuckNorisJoke {
    public final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisJokeImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
