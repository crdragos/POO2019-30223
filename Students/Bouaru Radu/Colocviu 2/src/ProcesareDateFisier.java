import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcesareDateFisier {
	@SuppressWarnings("resource")
	public void readMedicamente() throws IncompleteDataException {

		File fileMedicamente = new File("medicamente.txt");
		Scanner myReader;
		try {
			myReader = new Scanner(fileMedicamente);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] tokens = data.split(",");
				System.out.println(tokens.length);
				if (tokens.length < 4)
					throw new IncompleteDataException("Date incomplete");
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	public void readPacienti() throws WrongAgeFormatException {

		File filePacienti = new File("pacienti.txt");
		Scanner myReader;
		try {
			myReader = new Scanner(filePacienti);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] tokens = data.split(",");
				tokens[2] = tokens[2].trim();
				if (tokens[2].matches("\\d+") == false)
					throw new WrongAgeFormatException("Varsta este introdusa gresit");				
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
