package com.iteagles.learnit.kuzminHW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class TextEditor2 {
	private static Path path = Paths.get("E:\\JAVA\\LessonHW\\TextEditor.txt");
	public static String maxVowels = "";
	public static int maxVowel = 0;
	public static int wordCounter = 0;
	public static int numberOfLines = 0;

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\JAVA\\LessonHW\\TextEditor.txt");
		try {
			if (file.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> fileСontent = (List<String>) Files.readAllLines(path);
		String str;

		System.out.println("Enter your text");
		System.out.println("Enter \"exit\" to quit.");
		System.out.println("================================================================");

		for (int strings = 0; strings < 100; strings++) {
			str = br.readLine();
			if (str.equals("exit")) {
				break;
			}
			str = new String(str + "\n");
			Files.write(path, str.getBytes(), StandardOpenOption.APPEND);
		}

		System.out.println("\nHere is the text you entered: ");
		try (Stream<String> fStream = Files.lines(path)) {
			fStream.forEach(System.out::println);
		}

		System.out.println("================================================================");
		System.out.println("Total number of characters : " + numberOfCharacters(fileСontent));
		System.out.println("Max vowels at this string: " + vowels(fileСontent));
		System.out.println("Words added: " + wordCounter(fileСontent));

	}

	public static int numberOfCharacters(List<String> fileСontent) {
		int count = 0;
		String str;
		for (int i = 0; i < fileСontent.size(); i++) {
			str = fileСontent.get(i).toString();
			for (int j = 0; j < str.length(); j++) {
				count++;
				if (str.charAt(j) == ' ') {
					count--;
				}
			}
		}
		return count;
	}

	public static int wordCounter(List<String> fileСontent) {
		for (int i = 0; i < fileСontent.size(); i++) {
			String[] arr = fileСontent.get(i).split("[ ,!?.]+");
			wordCounter += arr.length;
		}
		return wordCounter;
	}

	public static int vowels(List<String> fileСontent) throws IOException {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String str = "";
		for (int i = 0; i < fileСontent.size(); i++) {
			int count = 0;
			str = fileСontent.get(i).toLowerCase().toString();

			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < vowels.length; k++) {
					if (str.charAt(j) == vowels[k]) {
						count++;
						break;
					}
				}
			}
			if (count > maxVowel) {
				maxVowel = count;
				maxVowels = str;
				numberOfLines = i + 1;
			}
		}
		return numberOfLines;
	}
}
