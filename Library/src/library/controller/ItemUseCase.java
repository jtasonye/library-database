/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.controller;

import library.model.LibraryDatabase;
import library.model.Copy;
import library.model.Book; 
import library.model.DVD; 
import library.model.Item;
/**
 *
 * @author sofig
 */
public class ItemUseCase {
    public static void addCopy(Item item){
        Copy copy = item.makeCopy();
    }
    
    public static void addBook(String callNumber, String title, String author){
        Book book = new Book(callNumber, title, author);
        LibraryDatabase.getInstance().add(book);
    }
    
    public static void addDVD(String callNumber, String title, String leadActor, String rating){
        DVD dvd = new DVD(callNumber, title, leadActor, rating);
        LibraryDatabase.getInstance().add(dvd);
    }
}
