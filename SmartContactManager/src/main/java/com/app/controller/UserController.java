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

import com.app.dto.GetUserDto;
import com.app.dto.UserDto;
import com.app.pojos.User;
import com.app.service.Userservice;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/user")
public class UserController 
{
     @Autowired
     private Userservice userserve;

     @PostMapping("/adduser")
     public ResponseEntity<UserDto> adduser(@RequestBody UserDto userdto)
     {
    	 return ResponseEntity.ok(userserve.createUser(userdto));
     }
     
     @GetMapping("/getAllUser")
     public  ResponseEntity<List<GetUserDto>>  getUser(@RequestBody GetUserDto getUserdto)
     {
		return ResponseEntity.ok(userserve.getAllUsser());
    	 
     }
     
     @GetMapping("/getUser/{id}")
     public ResponseEntity<GetUserDto> userFindById(@PathVariable Long id)
     {
    	 return ResponseEntity.ok(userserve.findUserById(id));
     }
     
     @DeleteMapping("/delteUser")
     public ResponseEntity<String> deleteUserByid(@RequestBody long id)
     {
    	 return ResponseEntity.ok(userserve.delteById(id));
     }
     
     @PutMapping("/updateUser/{id}")
     public ResponseEntity<UserDto> updateUserByid(@RequestBody UserDto userdto, @PathVariable long id)
     {
    	 return ResponseEntity.ok(userserve.updateUser(userdto, id));
     }
     
     

}
