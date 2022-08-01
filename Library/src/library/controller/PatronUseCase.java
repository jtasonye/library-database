
package library.controller;

import library.model.LibraryDatabase;
import library.model.Patron;
/**
 *
 * @author Team 2
 */
public class PatronUseCase {
    public static void addPatron(String firstName, String lastName, String address, String phoneNumber){
        Patron patron = new Patron(firstName, lastName, address, phoneNumber);
        LibraryDatabase.getInstance().add(patron);
    }
}
