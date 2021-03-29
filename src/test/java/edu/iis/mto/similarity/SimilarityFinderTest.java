package edu.iis.mto.similarity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import edu.iis.mto.searcher.SequenceSearcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class SimilarityFinderTest {

    @Test
    void testOnEmptySeq() {
        MockSequenceSearch searcher = new MockSequenceSearch();
        SimilarityFinder indexJaccard = new SimilarityFinder(searcher);
        int[] sequence1 = {};
        int[] sequence2 = {};
        assertThat(1.0d, Matchers.equalTo(indexJaccard.calculateJackardSimilarity(sequence1, sequence2)));

    }

}