package com.app.backend.application.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.backend.PropertiesApplication;
import com.app.backend.persistence.domain.Application;
import com.app.backend.persistence.repositories.ApplicationRepository;
import com.app.backend.utilities.DTO.ApplicationDTO;

@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<ApplicationDTO> findAll() {	
		List<Application> applicationList = applicationRepository.findAll();
		List<ApplicationDTO> applicationDTOList = new ArrayList<ApplicationDTO>();
		applicationList.stream().forEach((appli) -> applicationDTOList.add(modelMapper.map(appli, ApplicationDTO.class)));
		return applicationDTOList ;				
	}
	
	public String newAppli( String var){

		JSONObject objetoJson = new JSONObject(var);
		Application App = new Application();
		App.setCodigoQr(objetoJson.getString(PropertiesApplication.startProperties("cqr")));
		App.setImei(objetoJson.getString(PropertiesApplication.startProperties("im")));
		App.setUbicacion(objetoJson.getInt(PropertiesApplication.startProperties("ub")));
		App.setFecha(new Date());
		String message = (applicationRepository.save(App) != null) ? PropertiesApplication.startProperties("insert_correctly")
				: PropertiesApplication.startProperties("insert_not_correctly");	
		return message; 
		
	}
}
