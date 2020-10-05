package com.accion.cision.rest.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.repository.CisionPanelRepository;

@Service
public class CisionPanelService {
	
	@Autowired
	private CisionPanelRepository panelRepository;

	  public List<CisionPanelEntity> getAllPanels()
	    {
	        List<CisionPanelEntity> panelList = panelRepository.findAll();
	         
	        if(panelList.size() > 0) {
	            return panelList;
	        } else {
	            return new ArrayList<CisionPanelEntity>();
	        }
	    }
}
