package com.iteagles.learnit.kuzminHW7;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.io.FilenameFilter;

public class HomeWork7 {
	
	public static int n = 0;
    
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("===============================================================================");
		newFile();
		System.out.println("===============================================================================");
		filesInDirectory();
		String dir = "E:/JAVA";
		System.out.println("===============================================================================");
		System.out.print("Enter which extension you are interested in this directory: ");
		String ext = sc.nextLine();
		findFiles(dir, ext);
		System.out.println("===============================================================================");
		System.out.print("Enter the search path (For example: E:/JAVA): ");
		String dir2 = sc.nextLine();
		System.out.print("Enter file extension (For example: .java , .txt): ");
		String ext2 = sc.nextLine();
		int count = getNumberOfFiles(dir2, ext2);
		System.out.println("Number of files with the extension you entered in directory " + dir2 + ": " + count);
		System.out.println("===============================================================================");
	}

	public static void newFile() {

		File f = new File("E:/JAVA/Demo.txt");
		try {
			if (f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void filesInDirectory() {
		File dir = new File("E:/JAVA");
		File[] Files = dir.listFiles();
		List<File> listFiles = Arrays.asList(Files);
		System.out.println(listFiles);
	}

	private static void findFiles(String dir, String ext) {
		File file = new File(dir);
		if (!file.exists())
			System.out.println(dir + "folder does not exist");
		File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
		if (listFiles.length == 0) {
			System.out.println(dir + " does not contain files with the extension " + ext);
		} else {
			for (File f : listFiles)
				System.out.println("File: " + dir + File.separator + f.getName());
		}
	}

	public static class MyFileNameFilter implements FilenameFilter {

		private String ext;

		public MyFileNameFilter(String ext) {
			this.ext = ext.toLowerCase();
		}

		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(ext);
		}

	}
	
	public static int getNumberOfFiles (String dir2, String ext2) {
		FileFilter filefilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				if (file.getName().endsWith(ext2)) {
					return true;
				}
				return false;
			}
		};
		File f = new File(dir2);
		for (File file : f.listFiles()) {
			if (file.isFile() && filefilter.accept(file)) {
				n++;
			} else if (file.isDirectory()) {
				getNumberOfFiles(file.getAbsolutePath(), ext2);
			}
		}
		return n;
	}
}


