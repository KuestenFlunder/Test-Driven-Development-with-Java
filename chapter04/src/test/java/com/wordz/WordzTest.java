package com.wordz;

import com.wordz.domain.Letter;
import com.wordz.domain.Score;
import com.wordz.domain.Word;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WordzTest
{
    @Test
    void oneIncorrectLetter()
    {
        var word = new Word("A");

        var score = word.guess("Z");

        var result = score.letter(0);

        assertThat(result).isEqualTo(Letter.INCORRECT);
    }

    @Test
    void oneCorrectLetter()
    {
        var word = new Word("A");

        var score = word.guess("A");

        this.assertScoreForLetter(score, Letter.CORRECT);
    }

    private void assertScoreForLetter(Score score, Letter expected)
    {
        assertThat(score.letter(0)).isEqualTo(expected);
    }
}