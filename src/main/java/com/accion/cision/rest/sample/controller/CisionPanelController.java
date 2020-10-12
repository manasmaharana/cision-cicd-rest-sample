package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.exception.CisionPanelNotFoundException;
import com.accion.cision.rest.sample.exception.UserNotFoundException;
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

    /**
     * @return
     */
    @GetMapping(path = "/panels", produces = "application/json")
    public ResponseEntity<List<CisionPanelEntity>> getCisionPanels() {
        List<CisionPanelEntity> list = cisionPanelService.getAllPanels();
        return new ResponseEntity<List<CisionPanelEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * @param cisionPanelEntity
     * @return
     */
    @PostMapping(path = "/addPanel", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addCisionPanel(@RequestBody CisionPanelEntity cisionPanelEntity) {
        Integer id = cisionPanelRepository.findAll().size() + 1;
        cisionPanelRepository.save(cisionPanelEntity);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(path).build();
    }

    /**
     * @param panelId
     * @return
     * @throws CisionPanelNotFoundException
     */
    @DeleteMapping(path = "/deletePanel/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> deleteCisionPanel(@PathVariable("id") long panelId)
            throws CisionPanelNotFoundException {
        CisionPanelEntity existingUser = cisionPanelRepository.findById(panelId)
                .orElseThrow(() -> new CisionPanelNotFoundException(panelId));
        cisionPanelRepository.delete(existingUser);
        return ResponseEntity.ok().build();
    }

    /**
     * @param cisionPanelEntity
     * @return
     */
    @PostMapping(path = "/login",consumes = "application/json")
    public ResponseEntity<?> loginCisionPanel(@RequestBody CisionPanelEntity cisionPanelEntity) throws UserNotFoundException {
        if ((cisionPanelEntity.getEmail() == null || "".equalsIgnoreCase(cisionPanelEntity.getEmail())) ||
                (cisionPanelEntity.getPassword() == null || "".equalsIgnoreCase(cisionPanelEntity.getPassword()))) {
            return new ResponseEntity<>("Please provide email or password", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
        CisionPanelEntity entity = cisionPanelService.loginUser(cisionPanelEntity);
        if (entity != null) {
            return new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK);
        } else {
            throw new UserNotFoundException(cisionPanelEntity.getEmail());
        }


    }

    /**
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @PostMapping(path = "/change-password")
    public ResponseEntity<?> changeUserPassword(@RequestParam("password") String oldPassword, @RequestParam("newPassword") String newPassword) {
        cisionPanelService.updatePassword(oldPassword, newPassword);
        return new ResponseEntity<>("", new HttpHeaders(), HttpStatus.OK);
    }


}
