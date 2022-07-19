package com.kaywalker.orderapp_vertwo.DataList;

public class FriendItem {
    String name;
    String message;
    String engName;
    int resourceId;

    public FriendItem(int resourceId, String name, String message, String engName) {
        this.name = name;
        this.message= message;
        this.engName = engName;
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getEngName() {
        return engName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngName(String engName) {
        this.name = engName;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
