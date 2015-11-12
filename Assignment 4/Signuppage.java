
package userclass;

import java.util.Collections;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dmg23461
 * @version 1.0
 */
public class Signuppage extends Application {
    private static final int SIZE = 10;
    private static UserClass[] users = new UserClass[SIZE];
    private int index;
            
    @Override 
    public void start(Stage primaryStage) {
        Button signupBtn = new Button();
        signupBtn.setText("Submit");
        Label firstNameLbl = new Label("First Name:");
        Label lastNameLbl = new Label("Last Name:");
        Label emailLbl = new Label("Email:");
        Label userNameLbl = new Label("Username:");
        Label passwordLbl = new Label("Password:");
        Label confirmPasswordLbl = new Label("Confirm Password:");
        Label accountTypeLbl = new Label("Account Type:");
        TextField firstNameTxtFld = new TextField();
        TextField lastNameTxtFld = new TextField();
        TextField emailTxtFld = new TextField();
        TextField userNameTxtFld = new TextField();
        PasswordField pwTxtFld = new PasswordField();
        PasswordField confirmPwTxtFld = new PasswordField();
        ComboBox accTypeComboBox = new ComboBox();
        accTypeComboBox.getItems().addAll("Administrator", "Faculty", "Staff", "Guest", "Student");
        accTypeComboBox.setValue("");
        signupBtn.setText("Sign Up");
        
        signupBtn.setOnAction(new EventHandler<ActionEvent>() {
            String inputFirstName = "";
            String inputLastName = "";
            String inputEmail = "";
            String inputUserName = "";
            String inputPw = "";
            String inputConfirmPw = "";
            final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            final String PW_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}$";
            boolean pwmatch = false;
            boolean emailmatch = false;
            boolean status = false;
            
            @Override
            public void handle(ActionEvent event) {
                status = validate(firstNameTxtFld);
                if (status){
                    status = validate(lastNameTxtFld);
                    if (status){
                        status = validate(emailTxtFld);
                        inputEmail = emailTxtFld.getText();
                        emailmatch = inputEmail.matches(EMAIL_REGEX);
                        if (status && emailmatch){
                            status = validate(userNameTxtFld);
                            if (status){
                                status = validate(pwTxtFld);
                                inputPw = pwTxtFld.getText();
                                pwmatch = inputPw.matches(PW_REGEX);
                                if (status && pwmatch){
                                    inputConfirmPw = confirmPwTxtFld.getText();
                                    status = validate(confirmPwTxtFld);
                                    if(inputConfirmPw.equals(inputPw)){
                                        inputFirstName = firstNameTxtFld.getText();
                                        inputLastName = lastNameTxtFld.getText();
                                        inputEmail = emailTxtFld.getText();
                                        inputUserName = userNameTxtFld.getText();
                                        inputPw = pwTxtFld.getText();
                                        inputConfirmPw = confirmPwTxtFld.getText();
                                        users[index] = new UserClass(inputFirstName, inputLastName, inputEmail, inputUserName, inputPw, inputConfirmPw);
                                        JOptionPane.showMessageDialog(null, users[index] + "" + accTypeComboBox.getValue());
                                        index++;
                                        
                                    }else{
                                        JOptionPane.showMessageDialog(null, "ERROR: Your passwords do not match.");
                                    }
                                        
                                }else{
                                    JOptionPane.showMessageDialog(null, "ERROR: Please enter a valid password. Your password must contain at least 8 characters, is case sensitive and must include at least one of each of the following:\nUppercase characters\nLowercase characters\nNumbers\nNon-alphanumeric characters (!@#$%^&*_-+='|\\(){}[]:;'\"<>,.?/)");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "ERROR: Please enter a valid username.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "ERROR: Please enter a valid email address.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR: Please enter your last name.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: Please enter your first name.");
                }
            }
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(firstNameLbl,0,0);
        grid.add(lastNameLbl,0,1);
        grid.add(emailLbl,0,2);
        grid.add(userNameLbl,0,3);
        grid.add(passwordLbl,0,4);
        grid.add(confirmPasswordLbl,0,5);
        grid.add(accountTypeLbl,0,6);
        grid.add(firstNameTxtFld,1,0);
        grid.add(lastNameTxtFld,1,1);
        grid.add(emailTxtFld,1,2);
        grid.add(userNameTxtFld,1,3);
        grid.add(pwTxtFld,1,4);
        grid.add(confirmPwTxtFld,1,5);
        grid.add(accTypeComboBox,1,6);
        grid.add(signupBtn,1,7);
        
        Scene scene = new Scene(grid, 500, 500);
        scene.getStylesheets().add(getClass().getResource("JavaFX.css").toExternalForm());
        primaryStage.setTitle("Sign-Up Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean validate(TextField tf){
        boolean pass = false;
        ObservableList<String> styleClass = tf.getStyleClass();
        if (tf.getText().trim().length()==0) {
            if (! styleClass.contains("error")){
                styleClass.add("error");
            }
        }else{
            styleClass.removeAll(Collections.singleton("error"));
            pass = true;
        }
        return pass;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
