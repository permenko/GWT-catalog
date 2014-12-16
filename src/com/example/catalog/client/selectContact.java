package com.example.catalog.client;

import com.example.catalog.client.extendedInformationOfContact;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

/**
 * Choose a contact from the catalog
 */

public class selectContact {
	
	//Select contact by name
    selectContact(CellTable<Contact> table) {
        final SingleSelectionModel<Contact> selectionModel = new SingleSelectionModel<Contact>();
        table.setSelectionModel(selectionModel);
        selectionModel.addSelectionChangeHandler(
                new SelectionChangeEvent.Handler() {
                    public void onSelectionChange(SelectionChangeEvent event) {
                        Contact selected = selectionModel.getSelectedObject();
                        
                        //open extended information
                        new extendedInformationOfContact(selected);
                        
                        //close extended information
                        if (selectionModel.isSelected(selected)) {
                            selectionModel.clear();
                        }
                    }
                });
    }
}