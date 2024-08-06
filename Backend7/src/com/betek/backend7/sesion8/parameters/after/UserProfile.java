package com.betek.backend7.sesion8.parameters.after;


public class UserProfile {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;

    public UserProfile() {
    }

    public void updateProfile(String firstName, String lastName, String email, String phoneNumber,
                              Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void printProfile() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
    }

}