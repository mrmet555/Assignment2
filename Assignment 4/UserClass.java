/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclass;

/**
 *
 * @author Danny
 */
public class UserClass {
    
    private String firstName;
    private String lastName;
    private String email;
    private String uName;
    private String pWord;
    private String confirmpWord;

    
    public UserClass(){
        firstName = "First";
        lastName = "Last";
        email = "email";
        uName = "default";
        pWord = "default";
        confirmpWord = "default";
    }
    /**
     *
     */
    public UserClass(String firstname, String lastname, String email, String username, String password, String confirmpassword){
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.uName = username;
        this.pWord = password;
        this.confirmpWord = confirmpassword;

        // TODO code application logic here
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getUserName(){
        return this.uName;
    }
    public void setUserName(String username){
        this.uName = username;
    }
    public String getPassWord(){
        return this.pWord;
    }
    public void setPassWord(String password){
        this.pWord = password;
    }
    public String getConfirmPassWord(){
        return this.confirmpWord;
    }
    public void setConfirmPassWord(String confirmpassword){
        this.confirmpWord = confirmpassword;
    }
    public String toString(){
        return "Your username is " + this.uName + "\n" + "Your password is " + this.pWord + "\n" + "Your account type is ";
    }
}
