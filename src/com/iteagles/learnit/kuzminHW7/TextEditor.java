package com.iteagles.learnit.kuzminHW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class TextEditor {
	public static int length = 0; 
	public static int maxVowels = 0; 
	public static int wordCounter = 0; 
	public static int numberOfLines = 0;
	
	public static void main(String[] args) {
			try {
				textEditor();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("================================================================");
			System.out.println("Total number of characters : " + length);
			System.out.println("Number of added string with max vowels: " + numberOfLines); 
			System.out.println("Max vowels at this string: " + maxVowels); 
			System.out.println("Words added: " + wordCounter); 

	}
	public static void textEditor() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[1000];
		File file = new File("E://JAVA/textEditor.txt");
		try {
			if (file.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path path = file.toPath();

		System.out.println("Enter your text");
		System.out.println("Enter \"exit\" to quit.");
		System.out.println("================================================================");
		
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'E', 'U', 'I', 'O', 'A' };
		
		for (int strings = 0; strings < 1000; strings++) {
			str[strings] = br.readLine();
			if (str[strings].equals("exit")) {
				break;
			}
			wordCounter += str[strings].split("[ ,.!?]").length;

			str[strings] = new String(str[strings] + "\n");
			int countVowels = 0;
			for (int n = 0; n < str[strings].length(); n++) {
				char ch = str[strings].charAt(n);
				for (char ch2 : vowels) {
					if (ch == ch2) {
						countVowels++;
						if (countVowels > maxVowels) {
							maxVowels = countVowels;
							numberOfLines = (strings + 1);
						}
						break;
					}
					if (countVowels > maxVowels) {
						maxVowels = countVowels;
					}
				}
			}
			length += str[strings].length();

			Files.write(path, str[strings].getBytes(), StandardOpenOption.APPEND); // добавляет текст в существующий файл.
		}
		System.out.println("\nHere is the text you entered: ");
		try (Stream<String> fStream = Files.lines(path)) {
			fStream.forEach(System.out::println);
		}

	}
}

