package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Restaurant {

    private Menu menu;

    private Set<User> users;

    private Queue<Order> orders;


    public Restaurant() {
        this.users = Set.of(
                new User("Alice Johnson", "alice.johnson@example.com"),
                new User("Bob Smith", "bob.smith@example.com"),
                new User("Charlie Brown", "charlie.brown@example.com"),
                new User("Diana Prince", "diana.prince@example.com"),
                new User("Ethan Hunt", "ethan.hunt@example.com"),
                new User("Fiona Gallagher", "fiona.gallagher@example.com"),
                new User("George Bluth", "george.bluth@example.com"),
                new User("Hannah Abbott", "hannah.abbott@example.com"),
                new User("Ian Malcolm", "ian.malcolm@example.com"),
                new User("Julia Banks", "julia.banks@example.com")
        );

        this.menu = new Menu(List.of(
                new MenuItem("Avocado Toast", "Creamy avocado spread on artisan bread with a sprinkle of chili flakes", 6.50),
                new MenuItem("Bagel with Cream Cheese", "Freshly baked bagel served with cream cheese", 3.75),
                new MenuItem("Vegan Burger", "Plant-based burger patty served with lettuce, tomato, and vegan mayo", 8.99),
                new MenuItem("Smoothie Bowl", "Acai berry smoothie bowl topped with sliced bananas, granola, and honey", 7.25),
                new MenuItem("Pasta Carbonara", "Classic Italian pasta with creamy sauce, pancetta, and a touch of parsley", 11.00),
                new MenuItem("Philly Cheese Steak", "Sliced beef with melted cheese, onions, and peppers on a hoagie roll", 9.50),
                new MenuItem("Fish and Chips", "Beer-battered fish served with crispy fries and tartar sauce", 12.00),
                new MenuItem("Tomato Soup", "Rich and creamy tomato basil soup served with a side of croutons", 5.50),
                new MenuItem("Sushi Platter", "Assortment of fresh sushi rolls including salmon, tuna, and cucumber", 22.00),
                new MenuItem("Lemon Tart", "Sweet and tangy lemon tart topped with a light meringue", 4.50)
        ));

        this.orders = new LinkedList<>();

        this.orders.add(
                new Order(1,
                        List.of( new OrderItem(1,1),
                                new OrderItem(2,1),
                                new OrderItem(3,1))
                ));

        this.orders.add(
                new Order(2,
                        List.of( new OrderItem(4,2),
                                new OrderItem(5,2),
                                new OrderItem(6,2))
                )
        );
    }

    //display menu
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    //list users
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    //create user
    public void createUser(String name, String email){
        User newUser = new User(name,email);
        users.add(newUser);
    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    //List all users orders
    public Queue<Order> getAllUsersOrders(){
        return getOrders();
    }

    //Orders by userId
    public List<Order> getOrdersByUser(Integer userId){
        return getOrders()
                .stream()
                .filter(x->x.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

}
