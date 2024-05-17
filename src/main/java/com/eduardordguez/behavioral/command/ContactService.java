package com.eduardordguez.behavioral.command;

import java.util.ArrayList;

/**
 * The `Receiver` is the device that knows how to perform the actual operation associated with a
 * command.
 */
public class ContactService {

  private static ArrayList<Contact> contacts;

  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  public Contact getContact(int index) {
    return contacts.get(index);
  }

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void deleteContact(Contact contact) {
    contacts.remove(contact);
  }

}
