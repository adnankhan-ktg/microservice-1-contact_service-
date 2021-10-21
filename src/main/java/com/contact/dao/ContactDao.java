package com.contact.dao;

import com.contact.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactDao extends JpaRepository<Contact,Integer> {


      public List<Contact> findByUserId(int id);
}
