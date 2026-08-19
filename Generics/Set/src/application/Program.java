package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class Program {
	public static void main(String[] args) {
		String strPath = "/home/diegodevkoga/Documents/temp/arquivo.txt";
		File path = new File (strPath);
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set <LogEntry> logs = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Instant entry = Instant.parse(fields[1]);
				LogEntry log = new LogEntry(username,entry);
				logs.add(log);
				line = br.readLine();
			}
			System.out.println(logs.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 