package com.example.perrythomson.weathertoo;

/**
 * Created by perrythomson on 8/30/16.
 */
public class WeatherObject {  //entity or portable object we will be populating this info from a service rather than a db like @entity
    private String temp;
    private String location;
    private String condition;
    private String image;

    public String getTemp() {
        return temp;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
