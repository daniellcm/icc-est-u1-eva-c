package View;
import Models.Book;

public class ViewConsole {
    
    public void printBookArray(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + "-");
        }
        System.out.println();
    }

    public void printMensaja(String mensaje){
        System.out.println(mensaje);
    }
}
