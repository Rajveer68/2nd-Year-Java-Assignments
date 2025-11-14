import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 *     model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
        try (Scanner scanner = new Scanner(data)) {
            String modelEncoded = scanner.next();
            double screen = scanner.nextDouble();
            int battery = scanner.nextInt();
            String model = modelEncoded.replace('_', ' ');
            return new Phone(model, screen, battery);
        }
    }
	 
	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filename) throws IOException {
        PhoneList list = new PhoneList();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                Phone phone = parse(line);
                list.addPhone(phone);
            }
        }
        return list;
	}
}
