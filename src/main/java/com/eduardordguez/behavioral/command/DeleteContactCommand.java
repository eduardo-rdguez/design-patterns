package com.eduardordguez.behavioral.command;

/**
 * `Concrete Command` classes encapsulates the details of a particular action.
 */
public class DeleteContactCommand extends Command {

  private final ContactService contactService;
  private final Contact contact;

  public DeleteContactCommand(Contact contact, ContactService contactService) {
    this.contact = contact;
    this.contactService = contactService;
  }

  @Override
  public void execute() {
    contactService.addContact(contact);
  }

}
