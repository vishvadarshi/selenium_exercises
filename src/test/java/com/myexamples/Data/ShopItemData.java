package com.myexamples.Data;

public class ShopItemData {

    private String toyNameStuffedFrog;
    private String numberOfStuffedFrog;
    private String toyNameValantineBear;
    private String numberOfValantineBear;

    public ShopItemData(){
        this.toyNameStuffedFrog = "Stuffed Frog";
        this.numberOfStuffedFrog = "1";
        this.toyNameValantineBear = "Valantine Bear";
        this.numberOfValantineBear = "3";
    }

    public String getToyNameStuffedFrog(){
        return this.toyNameStuffedFrog;
    }

    public void setToyNameStuffedFrog(String toyNameStuffedFrog){
         this.toyNameStuffedFrog = toyNameStuffedFrog;
    }

    public String getnumberOfStuffedFrog(){
        return this.numberOfStuffedFrog;
    }

    public void setnumberOfStuffedFrogs(int numberOfStuffedFrogs){
         this.numberOfStuffedFrog = numberOfStuffedFrog;
    }

    public String getToyNameValantineBear(){
        return this.toyNameValantineBear;
    }

    public void setToyNameValantineBear(String valantineBear){
        this.toyNameValantineBear = valantineBear;
    }

    public String getNumberOfValantineBear(){
        return this.numberOfValantineBear;
    }


}
