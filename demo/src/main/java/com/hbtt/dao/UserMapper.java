package com.hbtt.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.hbtt.entiy.User;

@Repository
public interface UserMapper {
	public List<User> getAllUser();
}
