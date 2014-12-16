package com.example.catalog.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * New table with extended information of contact
 */

public class extendedInformationOfContact {
	
    extendedInformationOfContact(final Contact selected) {

        if (selected == null) {
            return;
        }

        RootPanel.get().clear();
    
        //Build new table
        final TextBox phoneNumberTextBox = new TextBox();
        final TextBox addressTextBox = new TextBox();
        final Label phoneNumberLabel = new Label("Phone number:");
        final Label addressLabel = new Label("Address:");
        final VerticalPanel panel = new VerticalPanel();
        phoneNumberTextBox.setText(selected.phoneNumber);
        addressTextBox.setText(selected.address);
        panel.setSpacing(5);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberTextBox);
        panel.add(addressLabel);
        panel.add(addressTextBox);
        
        //Creation "Save" button
        final Button saveButton = new Button("Save");
        saveButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                selected.address = addressTextBox.getValue();
                selected.phoneNumber = phoneNumberTextBox.getValue();
            }
        });
        panel.add(saveButton);
        
        //Creation "Close" button
        final Button closeButton = new Button("Close");
        closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                panel.remove(phoneNumberLabel);
                panel.remove(phoneNumberTextBox);
                panel.remove(addressLabel);
                panel.remove(addressTextBox);
                panel.remove(closeButton);
                panel.remove(saveButton);
            }
        });
        panel.add(closeButton);

        RootPanel.get().add(panel);
    }
}
