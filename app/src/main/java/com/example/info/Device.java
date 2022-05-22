//작성자: 이혁수
package com.example.info;

public class Device {
    private String id;
    private String name;
    private int maxCnt;
    private int currentCnt;
    private String img;
    private String description;

    public Device(){

    }

    public Device(String id, String name, int maxCnt, int currentCnt, String img,
                  String description){
        this.id=id;
        this.name=name;
        this.maxCnt=maxCnt;
        this.currentCnt=currentCnt;
        this.img=img;
        this.description=description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxCnt() {
        return maxCnt;
    }

    public int getCurrentCnt() {
        return currentCnt;
    }

    public String getImg() {
        return img;
    }

    public String getDescription() {
        return description;
    }

    public void rental(boolean isrental){
        if(isrental){
            currentCnt--;
        }
        else {
            currentCnt++;
        }
    }
}
