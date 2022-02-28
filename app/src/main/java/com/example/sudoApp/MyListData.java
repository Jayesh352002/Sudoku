package com.example.sudoApp;

public class MyListData {
    private String name , apply;
    private int t ;

    public MyListData(String name,int t,String apply ) {
        this.name = name;
        this.apply=apply;
        this.t = t;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApply(){
        return apply;
    }
    public void setApply(String apply){
        this.apply = apply;
    }
    public int getImgId() {
        return t;
    }
    public void setImgId(int imgId) {
        this.t = imgId;
    }
}
