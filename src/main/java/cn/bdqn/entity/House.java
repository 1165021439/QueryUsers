package cn.bdqn.entity;

import java.util.Date;

public class House {

    private  int id;

    private String title;

    private String descrirtion;

    private  int price;

    private Date pubdare;

    private  int floorage;

    private  String contact;

    private  int user_id;

    private  int type_id;

    private  int street_id;

    public  House()
    {

    }

    public House(String title, int floorage) {
        this.title = title;
        this.floorage = floorage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrirtion() {
        return descrirtion;
    }

    public void setDescrirtion(String descrirtion) {
        this.descrirtion = descrirtion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPubdare() {
        return pubdare;
    }

    public void setPubdare(Date pubdare) {
        this.pubdare = pubdare;
    }

    public int getFloorage() {
        return floorage;
    }

    public void setFloorage(int floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrirtion='" + descrirtion + '\'' +
                ", price=" + price +
                ", pubdare=" + pubdare +
                ", floorage=" + floorage +
                ", contact='" + contact + '\'' +
                ", user_id=" + user_id +
                ", type_id=" + type_id +
                ", street_id=" + street_id +
                '}';
    }
}
