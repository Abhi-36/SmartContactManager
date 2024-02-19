package com.app.service;

import java.util.List;

import com.app.dto.ContactDto;
import com.app.pojos.Contact;

public interface ContactService
{
 ContactDto createUser(ContactDto contactdto);
 String delteContact(long id);
 List<ContactDto> getAllContact();
 ContactDto findContactbyid(long id);
 ContactDto updateContact(ContactDto contactdto,Long id);
}
