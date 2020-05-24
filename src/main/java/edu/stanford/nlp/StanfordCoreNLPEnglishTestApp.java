package edu.stanford.nlp;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

/** app for testing if Maven distribution is working properly */

public class StanfordCoreNLPEnglishTestApp {
	private static final Logger log = LoggerFactory.getLogger(StanfordCoreNLPEnglishTestApp.class);

	public static void main(String[] args) throws IOException {
		log.info("Test started");
		String[] englishArgs = new String[] { "-file", "sample-english.txt", "-outputFormat", "text", "-props", "english.properties" };
		StanfordCoreNLP.main(englishArgs);
	}
}
