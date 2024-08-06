package com.betek.backend7.sesion8.parameters;


public class UserProfile {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public UserProfile() {
    }

    public void updateProfile(String firstName, String lastName, String email, String phoneNumber,
                              String address, String city, String state, String zipCode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void printProfile() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address + ", " + city + ", " + state + " " + zipCode + ", " + country);
    }

}