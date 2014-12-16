package com.example.catalog.client;

/**
 * A simple data type that represents a contact.
 */
class Contact {
    final String name;
    String address;
    String phoneNumber;

    Contact(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}