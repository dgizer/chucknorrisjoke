package com.springframework.chucknoris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokeImpl implements ChuckNorisJoke {
    public final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisJokeImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
