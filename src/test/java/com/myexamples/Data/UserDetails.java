package com.myexamples.Data;

public class UserDetails {
    private String userName;
    private String passWord;

    public UserDetails(){
        this.userName = "something";
        this.passWord = "letmein";
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
}
