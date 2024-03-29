package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import java.util.Calendar;

public class Book {

    public String Title;
    public String Author;
    public String Description;
    public String ISBN;
    public String Publisher;
    public String Genre;
    public int quantity = 5;
    public String cover;
    public float rating;
    public Image image;
    public Calendar borrowDate;
    public Calendar returnDate;
    public Boolean available = true;
    public boolean created;

    public Book(String t, String a, String d, String i, String g, String p, String image) {

        this.cover = image;
        this.image = new Image("/library/" + image);
        this.Title = t;
        this.Author = a;
        this.Description = d;
        this.ISBN = i;
        this.Genre = g;
        this.Publisher = p;
    }

    public Book(String t, String a, String d, String i, String g, String p, Image image, boolean b) {

        this.cover = "c";
        this.image = image;
        this.Title = t;
        this.Author = a;
        this.Description = d;
        this.ISBN = i;
        this.Genre = g;
        this.Publisher = p;
        this.created = b;
    }

    public void load() throws FileNotFoundException {
        this.image = new Image(new FileInputStream("/library/" + image));
    }

//    public void calcRating(){
//        
//    }
//    
//    public void checkAvaialbilty(){
//        
//    }
}
