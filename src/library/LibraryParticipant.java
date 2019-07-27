
package library;


public class LibraryParticipant {
    public String firstName;
    public String lastName;
    public String birthdate;
    public String Username;
    public String email;
    public String cardNumber;
    public String password;

    
public LibraryParticipant (String fn, String ln, String bd, String email, String cn, String un, String password){
    this.firstName=fn;
    this.lastName=ln;
    this.birthdate=bd;
    this.email=email;
    this.cardNumber=cn;
    this.Username = un;
    this.password=password;
    }
}
