/*
 * RenewUseCase.java
 */
package library.controller;

import library.model.Copy;
import library.model.Patron;
import library.gui.GUI;

/**
 *
 * @author Sofi Stonehouse, Jason Asonye, Daniel Lovelace, and Mya Randolph
 */
public class RenewUseCase {
    public static void perform(Copy copy) {
        copy.renew();
        GUI.getInstance().showMessage("Due: " + copy.getDateDue());
    }
    
    // Private constructor prevents instantiation
    private RenewUseCase()
    { }   
}
