package com.example.catalog.client;

import java.util.Arrays;
import java.util.List;

import com.example.catalog.client.Contact;
import com.example.catalog.client.selectContact;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * A simple data type that represents a catalog of contacts.
 */

public class Catalog implements EntryPoint {
	
	//The list of data to display
    List<Contact> CONTACTS = Arrays.asList(
            new Contact("John", "123 Fourth Avenue", "8(905)326-03-46"),
            new Contact("Joe", "22 Lance Ln", "8(905)326-03-18"),
            new Contact("George", "1600 Pennsylvania Avenue", "8(905)326-05-95")
    );
    
    //Creating list of names
    CellTable<Contact> createListOfContacts() {
        CellTable<Contact> contactsList = new CellTable<Contact>();
        TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.name;
            }
        };
        contactsList.addColumn(nameColumn, "Name");
        contactsList.setRowData(0, CONTACTS);
        return contactsList;
    }

    public void onModuleLoad() {
    	
        CellTable<Contact> contactsList = new CellTable<Contact>();
        contactsList = createListOfContacts();

        new selectContact(contactsList);

        RootPanel.get("gwtContainer").add(contactsList);

    }
}