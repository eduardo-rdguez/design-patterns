package com.eduardordguez.behavioral.command;

/**
 * `Command` is a behavioral design pattern that turns a request into a stand-alone object that
 * contains all information about the request. This transformation lets you pass requests as a
 * method arguments, delay or queue a request’s execution, and support undoable operations.
 */
public class CommandPattern {

  private static final ContactService contactService = new ContactService();

  public static void main(String[] args) {
    Contact contact = new Contact(null, "username", "username@domain.com");

    Command addContactCommand = new AddContactCommand(contact, contactService);
    Command deleteContactCommand = new DeleteContactCommand(contact, contactService);

    ContactControl contactControl = new ContactControl();
    contactControl.setCommand(addContactCommand);
    contactControl.submit();

    contactControl.setCommand(deleteContactCommand);
    contactControl.submit();
  }

}
