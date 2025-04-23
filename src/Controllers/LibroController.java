package Controllers;

import java.awt.print.Book;

public class LibroController {

    public void sortByName(Book[] libros) {
        for (int i = 0; i < libros.length; i++){
            Book actual = libros[i];
            int j =  i - 1;
            while () {
                
            }
            

        }
    }

    public Book searchByName(Book[] libros, String name) {
        int izq = 0;
        int der = libros.length -1;
        while (izq <= der) {
            int cen = (izq + der) / 2;
            int comp = libros(cen).getName.compareToIngnoreCase(name);

            if (comp == 0) {
                return libros(cen);
            } else {


            }
        }
        return null;
    }
    
}
