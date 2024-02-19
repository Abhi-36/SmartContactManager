package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ContactDto;
import com.app.service.ContactService;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = {"*"})
public class ContactController 
{
	@Autowired
	private ContactService contactserve;
	
	@PostMapping("/addcontact")
	public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactdto)
	{
		return ResponseEntity.ok(contactserve.createUser(contactdto));
	}
	
	@GetMapping("/getcontact")
	public ResponseEntity<List<ContactDto>> getAllContact(@RequestBody ContactDto contact)
	{
		return ResponseEntity.ok(contactserve.getAllContact());
	}
	
	@GetMapping("/getcotact/{id}")
	public ResponseEntity<ContactDto> getcontactById(@PathVariable long id)
	{
	return ResponseEntity.ok(contactserve.findContactbyid(id));	
	}
	
	@DeleteMapping("/deletecontact/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable long id)
	{
		return ResponseEntity.ok(contactserve.delteContact(id));
	}
	
	@PutMapping("/updateContact/{id}")
	public ResponseEntity<ContactDto> updateContact(@RequestBody ContactDto contactdto,@PathVariable long id)
	{
		return ResponseEntity.ok(contactserve.updateContact(contactdto, id));
	}

}
