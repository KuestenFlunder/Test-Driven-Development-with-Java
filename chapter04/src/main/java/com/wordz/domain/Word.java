package com.wordz.domain;

public class Word
{
    private final String word;

    public Word(final String correctWord)
    {
        this.word = correctWord;
    }

    public Score guess(final String attempt)
    {
        Score score = new Score(this.word);

        score.assess(attempt);

        return score;
    }
}
