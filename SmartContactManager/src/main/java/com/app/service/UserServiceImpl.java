package com.app.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.dto.GetUserDto;
import com.app.dto.UserDto;
import com.app.pojos.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements Userservice
{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public UserDto createUser(UserDto userdto) {
		
		User user=converintoUser(userdto);
		User user1=userRepo.save(user);
		return convertintoUserDto(user1);
	}

	private UserDto convertintoUserDto(User user1) {
		UserDto userdto1=mapper.map(user1, UserDto.class);
		return userdto1;
	}

	private User converintoUser(UserDto userdto) {
		
		User user=mapper.map(userdto, User.class);
		return user;
	}

	@Override
	public List<GetUserDto> getAllUsser() 
	{
	    List<User> user=userRepo.findAll();
	    List<GetUserDto> getuserdto=user.stream().map(userdto1->convetGetUserDto(user)).collect(Collectors.toList());
		return getuserdto;
	}

	private GetUserDto convetGetUserDto(List<User> user) {
		GetUserDto getUserdto2=mapper.map(user,GetUserDto.class);
		return getUserdto2;
	}

	@Override
	public GetUserDto findUserById(long id) 
	{
		
		//User user=GetUserDtoToConvertUser(id);
		User user1=userRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong Please Check The Id"));
		return UserToConvertGetUserDto(user1);
	}

	private GetUserDto UserToConvertGetUserDto(User user1) {
		GetUserDto getuserdto=mapper.map(user1,GetUserDto.class);
		return getuserdto;
	}

//	private User GetUserDtoToConvertUser(long id) {
//		User user=mapper.map(id,User.class);
//		return user;
//	}

	@Override
	public String delteById(long id) {
		
		User user=userRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong Please Check The Id"));
		userRepo.delete(user);
		return "User is Deleted";
	}

	@Override
	public UserDto updateUser(UserDto userdto, long id) {
		User user=converintoUser(userdto);
		User user1=userRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong Please Check The Id"));
		userRepo.save(user1);
		
		return convertintoUserDto(user1);
	}

}
