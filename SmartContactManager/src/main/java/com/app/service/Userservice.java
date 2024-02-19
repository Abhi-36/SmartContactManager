package com.app.service;

import java.util.List;

import com.app.dto.GetUserDto;
import com.app.dto.UserDto;
import com.app.pojos.User;

public interface Userservice 
{
 UserDto createUser(UserDto userdto);	
 List<GetUserDto> getAllUsser();
 GetUserDto findUserById(long id);
 String delteById(long id);
 UserDto updateUser(UserDto user,long id);
 
}
