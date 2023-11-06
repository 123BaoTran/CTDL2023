package Lab07.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;;

public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> wordCountList = new ArrayList<>();
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Count word frequency
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Convert the word frequency map to a list of WordCount objects
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            wordCountList.add(new WordCount(entry.getKey(), entry.getValue()));
        }

        return wordCountList;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> uniqueWords = new HashSet<>();
        Set<String> nonUniqueWords = new HashSet<>();

        for (String word : words) {
            if (!nonUniqueWords.contains(word)) {
                if (!uniqueWords.contains(word)) {
                    uniqueWords.add(word);
                } else {
                    uniqueWords.remove(word);
                    nonUniqueWords.add(word);
                }
            }
        }

        return uniqueWords;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		return new HashSet<>(words);
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		Map<String, Integer> wordFrequency = new TreeMap<>();

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        Set<WordCount> wordCountSet = new TreeSet<>(Comparator.comparing(WordCount::getWord));

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            wordCountSet.add(new WordCount(entry.getKey(), entry.getValue()));
        }

        for (WordCount wordCount : wordCountSet) {
            System.out.println(wordCount.getWord() + " - " + wordCount.getCount());
        }

        return wordCountSet;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
	Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        Set<WordCount> wordCountSet = new TreeSet<>(new Comparator<WordCount>() {
            @Override
            public int compare(WordCount wc1, WordCount wc2) {
                // Sort by occurrence count in descending order
                int countComparison = Integer.compare(wc2.getCount(), wc1.getCount());
                // If occurrences are the same, sort alphabetically
                return countComparison != 0 ? countComparison : wc1.getWord().compareTo(wc2.getWord());
            }
        });

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            wordCountSet.add(new WordCount(entry.getKey(), entry.getValue()));
        }

        for (WordCount wordCount : wordCountSet) {
            System.out.println(wordCount.getWord() + " - " + wordCount.getCount());
        }

        return wordCountSet;
    }


	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		Set<String> filteredWords = new HashSet<>();

        for (String word : words) {
            if (!word.startsWith(pattern)) {
                filteredWords.add(word);
            }
        }

        return filteredWords;
	}
}
