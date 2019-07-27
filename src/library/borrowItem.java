package library;

public class borrowItem {
    
    public String username;
    public String bookISBN;
    public String bookName;
    public String bdate;
    public String retdate;
   
    
    public borrowItem(String u , String i , String n,String b , String r){
        this.username = u;
        this.bookISBN = i;
        this.bookName = n;
        this.retdate  = r;
        this.bdate = b;
    }
}
