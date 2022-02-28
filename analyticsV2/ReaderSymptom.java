package analyticsV2;

import java.util.*;
import java.io.*;

/**
 * This is our class for reading the symptom file with a filePath and a BufferedReader
 *
 */
public class ReaderSymptom implements IReaderSymptom {

	private String filePath;

	/**
	 * 
	 * @param filePath
	 */
	public ReaderSymptom(String filePath) {
		this.filePath = filePath;
	}

	@Override
	/**
	 * @return the result of reading the occurrence file
	 * This method will browse the filepath so that we can read our source file symptoms.txt
	 */
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filePath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filePath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.err.println(" Error while reading into file " + e.getMessage());
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						System.err.println(" Error while reading into file " + e.getMessage());
					}
				}

			}
		}

		return result;
	}

}