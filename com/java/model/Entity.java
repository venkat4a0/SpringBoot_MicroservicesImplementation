package com.java.model;

public class Entity {

    private int id;
    private String name;

    private String address;

    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId(1);
        entity.setName("venkat");
        entity.setAddress("chennai");
        System.out.println("id = "+entity.getId());
        System.out.println("name = "+entity.getName());
    }
}
