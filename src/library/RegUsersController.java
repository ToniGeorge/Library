
package library;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class RegUsersController implements Initializable {
   @FXML
    private JFXTextField fname;
    
    @FXML
    private JFXTextField lname;
    
    @FXML
    private JFXTextField user;
    
     @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField bdate;

    @FXML
    private JFXTextField num;

    @FXML
    private JFXTextField pass;
    
String firstName ;
    
    Borrower newBr;
    /**
     * Initializes the controller class.
     */
    
   ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("hi");
        
//       ini();
    }    
//    @FXML
//    public void get(){
//        
//    }
     @FXML

    private void reg(ActionEvent event){
       

       Borrower newBr =new Borrower("toni","george","15/9/1995","tonigeorge@outlook.com","33","ton","123456");
       

//            FXMLLoader loader = new FXMLLoader();
//           loader.setLocation(getClass().getResource("RegUsers.fxml"));
//         try {
//             loader.load();       
//        } catch(Exception e) {
//           e.printStackTrace();
//          }
//         
//             RegUsersController d = loader.getController();
//             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
//               String firstName ;
//       System.out.print(lname.getText());
//       System.out.print(bdate.getText());
//       System.out.print(email.getText());
//       System.out.print(num.getText());
//       System.out.print(userName.getText());
//       System.out.print(pass.getText());


        newBr =new Borrower(fname.getText(),lname.getText(),bdate.getText(),email.getText(),num.getText(),user.getText(),pass.getText());
        Library.users.add(newBr);
        for(int i = 0 ; i <Library.users.size();i++){
           System.out.println(Library.users.get(i).Username);
           System.out.println(Library.users.get(i).password);
        }
    }
    
      @FXML
    private void back(ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("Library_FXML.fxml"));
         try {
             loader.load();       
        } catch(Exception e) {
           e.printStackTrace();
          }
         
             //FXMLController d = loader.getController();
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                //d.getUser(loginID.getText());
                //System.out.println(loginID.getText());
         Parent root1 = loader.getRoot();            
            Undecorator undecorator = new Undecorator(stage, (Region) root1);
 
// Default theme
 undecorator.getStylesheets().add("skin/undecorator.css");
 Scene scene1 = new Scene(undecorator);
 scene1.setFill(Color.TRANSPARENT);
stage.setScene(scene1);
stage.show();
        stage.setResizable(false);

    }
    
}
