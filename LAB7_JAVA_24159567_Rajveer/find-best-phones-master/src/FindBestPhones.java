
import java.io.IOException;
import java.util.Collection;

public class FindBestPhones {
	public static String PHONES_FILE = "LAB7_JAVA_24159567_Rajveer/find-best-phones-master/phone-data.txt";
	
	public static void main(String[] args) {
        try {
            PhoneList phones = PhoneParser.parseFile(PHONES_FILE);
            Collection<Phone> best = phones.getBestPhones();
            for (Phone p : best) {
                System.out.println(p.getModel());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
	}
} 
