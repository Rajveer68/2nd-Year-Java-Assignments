import java.util.List;

//This class extends Publication
public class Book {
    private final String publisher;
    
    //To create a Book object you need list of authors, title and year
    //The Book constructor calls the constructor of the super class and pass to it the list of authors, title and year
    //The constructor of the Book class sets the publisher of the Book
   
    public String getPublisher() {
       //return the publisher
    } 
        
    @Override
    public String harvardReference() {
    	//This method returns a call to the harvardReference() method of the super class and prints the publisher for the book
    }
}
