package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //add Menu item by Id
    public void add(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    //delete Menu Item by Id
    public void delete(Integer id){
        menuItems = menuItems.stream().filter(x-> !Objects.equals(x.getId(), id)).toList();
    }

    //update Menu Item by Id
    public void update(Integer id, MenuItem menuItem){
        menuItems = menuItems.stream().map(x-> x.getId().equals(id)?menuItem:x).collect(Collectors.toList());
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //get All Menu items


    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    //get menu Item by id
    public Optional<MenuItem> getById(Integer id){
        return menuItems.stream().filter(item -> item.getId().equals(id)).findFirst();
    }


}
