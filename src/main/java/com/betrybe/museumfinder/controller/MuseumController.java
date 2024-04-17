package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum Controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {
  private MuseumServiceInterface museumServiceInterface;

  /**
   * Instantiates a new Museum controller.
   *
   * @param museumServiceInterface the museum service interface
   */
  @Autowired
  public MuseumController(MuseumServiceInterface museumServiceInterface) {
    this.museumServiceInterface = museumServiceInterface;
  }

  /**
   * Gets closest museum.
   *
   * @param lat       the lat
   * @param lng       the lng
   * @param maxDistKm the max dist km
   * @return the closest museum
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosestMuseum(
      @RequestParam(name = "lat") Double lat,
      @RequestParam(name = "lng") Double lng,
      @RequestParam(name = "max_dist_km") Double maxDistKm) {

    Coordinate coordinate = new Coordinate(lat, lng);
    Museum museumClosest = museumServiceInterface.getClosestMuseum(coordinate, maxDistKm);

    MuseumDto convertModelToDto = ModelDtoConverter.modelToDto(museumClosest);

    return ResponseEntity.status(200).body(convertModelToDto);
  }

  /**
   * Create museum response entity.
   *
   * @param museumDto the museum dto
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<MuseumCreationDto> createMuseum(@RequestBody MuseumCreationDto museumDto) {
    Museum convertDtoToMuseumModel = ModelDtoConverter.dtoToModel(museumDto);
    Museum create = museumServiceInterface.createMuseum(convertDtoToMuseumModel);
    return ResponseEntity.status(201).body(museumDto);
  }

  /**
   * Gets museum by id.
   *
   * @param id the id
   * @return the museum by id
   */
  @GetMapping("/{id}")
  public ResponseEntity<MuseumDto> getMuseumById(@PathVariable Long id) {
    MuseumDto musuemById = ModelDtoConverter.modelToDto(museumServiceInterface.getMuseum(id));
    return ResponseEntity.status(200).body(musuemById);
  }
}
