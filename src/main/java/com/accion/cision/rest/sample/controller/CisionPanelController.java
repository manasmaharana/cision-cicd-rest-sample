package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.exception.CisionPanelNotFoundException;
import com.accion.cision.rest.sample.repository.CisionPanelRepository;
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
	private CisionPanelRepository cisionPanelRepository;

	@Autowired
	private CisionPanelService cisionPanelService;

	@GetMapping(path = "/panels", produces = "application/json")
	public ResponseEntity<List<CisionPanelEntity>> getCisionPanels() {

		List<CisionPanelEntity> list = cisionPanelService.getAllPanels();
		return new ResponseEntity<List<CisionPanelEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/addPanel", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addCisionPanel(@RequestBody CisionPanelEntity cisionPanelEntity) {
		Integer id = cisionPanelRepository.findAll().size() + 1;

		cisionPanelRepository.save(cisionPanelEntity);

		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

		return ResponseEntity.created(path).build();
	}

	@DeleteMapping(path = "/deletePanel/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> deleteCisionPanel(@PathVariable("id") long panelId)
			throws CisionPanelNotFoundException {
		CisionPanelEntity existingUser = cisionPanelRepository.findById(panelId)
				.orElseThrow(() -> new CisionPanelNotFoundException(panelId));
		cisionPanelRepository.delete(existingUser);
		return ResponseEntity.ok().build();
	}

	@PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
	public CisionPanelEntity loginCisionPanel(@RequestBody CisionPanelEntity cisionPanelEntity)
			throws CisionPanelNotFoundException {
		CisionPanelEntity loginUSer = cisionPanelService.loginUSer(cisionPanelEntity);
		return loginUSer;

	}

}
