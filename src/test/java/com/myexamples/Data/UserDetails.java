package com.myexamples.Data;

public class UserDetails {
    private String userName;
    private String passWord;
    private String userName1;
    private String passWord1;

    public UserDetails(){
        this.userName = "something";
        this.passWord = "letmein";
        this.userName1 = "test";
        this.passWord1 = "letmein";
    }

    public String getuserName(){
        return this.userName;
    }

    public void  setuserName(String userName){
        this.userName = userName;
    }

    public String getpassWord(){
        return this.passWord;
    }

    public void setpassWord(String passWord){
        this.userName = passWord;
    }

    public String getuserName1(){
        return this.userName1;
    }

    public void  setuserName1(String userName){
        this.userName1 = userName;
    }

    public String getpassWord1(){
        return this.passWord1;
    }

    public void setpassWord1(String passWord){
        this.passWord1 = passWord;
    }
}
