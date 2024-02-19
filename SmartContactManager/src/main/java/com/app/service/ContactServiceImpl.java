package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.dto.ContactDto;
import com.app.pojos.Contact;
import com.app.repository.ContactRepository;

@Service
@Transactional
public class ContactServiceImpl implements ContactService
{
     @Autowired
     private ContactRepository contactRepo;
     
     @Autowired
     private ModelMapper mapper;
	
	@Override
	public List<ContactDto> getAllContact() 
	{
		List<Contact> contact=contactRepo.findAll();
		List<ContactDto> contactdto=contact.stream().map(contactdto1->ContactconvertIntoContactDto(contact)).collect(Collectors.toList());
		return contactdto;
	}

	@Override
	public ContactDto createUser(ContactDto contactdto) {
		Contact contact=convertIntoContact(contactdto);
		Contact contact1=contactRepo.save(contact);
		return convertIntoContactDto(contact1);
	}

	private ContactDto convertIntoContactDto(Contact contact1) {
		ContactDto contactdto=mapper.map(contact1, ContactDto.class);
		return contactdto;
	}

	private Contact convertIntoContact(ContactDto contactdto) {
		Contact contact=mapper.map(contactdto, Contact.class);
		return contact;
	}

	private ContactDto ContactconvertIntoContactDto(List<Contact> contact)
	{
		ContactDto contactdto=mapper.map(contact, ContactDto.class);
		return contactdto;
	}
	@Override
	public String delteContact(long id) {
		Contact contact=contactRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong Please Check The Id"));
		contactRepo.delete(contact);
		return "contact is Deleted";
	}

	@Override
	public ContactDto findContactbyid(long id) {
	//	Contact contact=convertIntoContactById(id);
		Contact coantact1=contactRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong Please Check The Id"));
		return convertIntoContactDto(coantact1);
	}

//	private Contact convertIntoContactById(long id) {
//		Contact contact=mapper.map(id, Contact.class);
//		return contact;
//	}

	@Override
	public ContactDto updateContact(ContactDto contactdto, Long id) {
		Contact contact=convertIntoContact(contactdto);
		Contact contact1=contactRepo.save(contact);
		return convertIntoContactDto(contact1);
	}

}
