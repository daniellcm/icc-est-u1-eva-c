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

        public Book searchByName(Book[] personas, String nombre) {
            int izq = 0;
            int der = personas.length - 1;
    
            while (izq <= der) {
                int cen = (izq + der) / 2;
                int comparacion = personas[cen].getName().compareToIgnoreCase(nombre);
    
                if (comparacion == 0) {
                    return personas[cen];
                } else if (comparacion < 0) {
                    izq = cen + 1;
                } else {
                    der = cen - 1;
                }
            }
    
            return null;
        }
    }
    
}
