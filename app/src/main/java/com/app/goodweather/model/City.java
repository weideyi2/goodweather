package com.app.goodweather.model;

/**
 * Created by Administrator on 2016/8/11 0011.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provonceId;

    public int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode=cityCode;
    }

    public int getProvonceId(){
        return provonceId;
    }
    public  void setProvonceId(int provonceId){
        this.provonceId=provonceId;
    }

}
