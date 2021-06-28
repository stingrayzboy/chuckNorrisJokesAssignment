package com.faraz.chucknorrisjokesassignment.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GetJokesImpl implements GetJokes {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetJokesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
