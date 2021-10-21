package com.contact.services.impl;

import com.contact.dao.ContactDao;
import com.contact.models.Contact;
import com.contact.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;


    @Override
    public List<Contact> getContacts(int userId) {
               return this.contactDao.findByUserId(userId);

    }

    @Override
    public Contact addContact(Contact contact) {
        return this.contactDao.save(contact);
    }
}
