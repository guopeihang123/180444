package com.gph.Serivce;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gph.bean.User;
import com.gph.mapper.UserMapper;

@Service
public class UserSerivceImpl implements UserSerivce{

	@Resource
	public UserMapper us;

	public List<User> sel() {
		// TODO Auto-generated method stub
		return us.sel();
	}
}
