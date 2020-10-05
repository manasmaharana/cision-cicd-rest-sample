package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.dao.CisionPanelDAO;
import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.model.CisionPanel;
import com.accion.cision.rest.sample.service.CisionPanelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/cision")
public class CisionPanelController {

    @Autowired
    private CisionPanelDAO cisionPanelDAO;
    
    @Autowired
    private CisionPanelService cisionPanelService;

    @GetMapping(path = "/panels", produces = "application/json")
    public ResponseEntity<List<CisionPanelEntity>> getCisionPanels() {
    	
        //return cisionPanelDAO.getAllCisionPanels();
    	 List<CisionPanelEntity> list = cisionPanelService.getAllPanels();
		return new ResponseEntity<List<CisionPanelEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/addPanel", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addCisionPanel(@RequestBody CisionPanel cisionPanel) {
        Integer id = cisionPanelDAO.getAllCisionPanels().getCisionPanelList().size() + 1;

        cisionPanelDAO.addCisionPanel(cisionPanel);

        URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

        return ResponseEntity.created(path).build();
    }
}
