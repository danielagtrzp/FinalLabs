package org.example;


public class User {
    private Integer id;
    private String name;
    private String email;
    private Cart cart;

    private static int count=0;
    public User(String name, String email) {
        this.id = count++;
        this.name = name;
        this.email = email;
        this.cart = new Cart(this.id);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
