package com.app.backend.shared.converters;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Converters {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
