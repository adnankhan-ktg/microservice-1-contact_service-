package com.contact.controllers;

import com.contact.models.Contact;
import com.contact.services.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    private static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/user/{id}")
    public List<Contact> getContactsById(@PathVariable("id") int id)
    {
           return this.contactService.getContacts(id);
    }


    @PostMapping("/create")
    public Contact addContact(@RequestBody Contact contact){

        return this.contactService.addContact(contact);
    }


}
