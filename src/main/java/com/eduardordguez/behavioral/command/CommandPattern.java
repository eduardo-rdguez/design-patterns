package com.eduardordguez.behavioral.command;

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
