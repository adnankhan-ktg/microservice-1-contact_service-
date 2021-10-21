package com.contact.services;

import com.contact.models.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContacts(int userId);
    public Contact addContact(Contact contact);
}
