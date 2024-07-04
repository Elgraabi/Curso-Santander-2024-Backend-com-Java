package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		logger.info("Finding user by ID: {}", id);
		return userRepository.findById(id).orElseThrow(() -> {
			logger.error("User not found with ID: {}", id);
			return new NoSuchElementException("User not found");
		});
	}

	@Override
	public User create(User userToCreate) {
		logger.info("Creating user with account number: {}", userToCreate.getAccount().getNumber());
		if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			logger.error("Account number {} already exists", userToCreate.getAccount().getNumber());
			throw new IllegalArgumentException("This Account number already exists.");
		}
		return userRepository.save(userToCreate);
	}
}
