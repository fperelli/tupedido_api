package com.tupedido.ap.service;

import com.tupedido.api.model.User;

public interface UserService {

	User findByEmailAndPassword(String username, String password);

	User create(User u);

	User findByEmail(String email);

}
