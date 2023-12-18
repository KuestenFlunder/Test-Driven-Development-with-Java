package com.wordz.domain;

public class Score
{
    private final String word;
    private int position = 0;

    private Letter result = Letter.INCORRECT;

    public Score(final String word)
    {
        this.word = word;
    }

    public Letter letter(int position)
    {
        return this.result;
    }

    public void assess(final String attempt)
    {
        if (this.isCorrectLetter(this.position, attempt))
        {
            this.result = Letter.CORRECT;
        }
    }

    private boolean isCorrectLetter(final int position, final String attempt)
    {
        return this.word.charAt(position) == attempt.charAt(position);
    }
}
