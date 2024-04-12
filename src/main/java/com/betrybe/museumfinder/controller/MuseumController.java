package com.betrybe.museumfinder.controller;


import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum Controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {
  private MuseumServiceInterface museumServiceInterface;

  @Autowired
  public MuseumController(MuseumServiceInterface museumServiceInterface) {
    this.museumServiceInterface = museumServiceInterface;
  }

@PostMapping
  public ResponseEntity<MuseumCreationDto> createMuseum(@RequestBody MuseumCreationDto museumDto){
    Museum convertToMuseumModel = ModelDtoConverter.dtoToModel(museumDto);
    Museum create = museumServiceInterface.createMuseum(convertToMuseumModel);
    return ResponseEntity.status(201).body(museumDto);
}
}
