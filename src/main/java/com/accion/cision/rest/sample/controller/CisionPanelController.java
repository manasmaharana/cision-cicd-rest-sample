package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.dao.CisionPanelDAO;
import com.accion.cision.rest.sample.model.CisionPanel;
import com.accion.cision.rest.sample.model.CisionPanels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/cision")
public class CisionPanelController {

    @Autowired
    private CisionPanelDAO cisionPanelDAO;

    @GetMapping(path = "/panels", produces = "application/json")
    public CisionPanels getCisionPanels() {
        return cisionPanelDAO.getAllCisionPanels();
    }

    @PostMapping(path = "/addPanel", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addCisionPanel(@RequestBody CisionPanel cisionPanel) {
        Integer id = cisionPanelDAO.getAllCisionPanels().getCisionPanelList().size() + 1;

        cisionPanelDAO.addCisionPanel(cisionPanel);

        URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

        return ResponseEntity.created(path).build();
    }
}
