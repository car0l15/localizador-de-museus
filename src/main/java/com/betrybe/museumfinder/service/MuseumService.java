package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Museum service.
 */
@Service
public class MuseumService implements MuseumServiceInterface {

  private MuseumFakeDatabase museumFakeDatabase;

  @Autowired
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }

  @Override
  public List<Museum> getAllMuseums() {
    List<Museum> getAllMuseums = museumFakeDatabase.getAllMuseums();
    return getAllMuseums;
  }

  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {

    if (!CoordinateUtil.isCoordinateValid(coordinate)) {
      throw new InvalidCoordinateException();
    }
    Optional<Museum> closerMuseum = museumFakeDatabase.getClosestMuseum(coordinate, maxDistance);

    if (closerMuseum.isEmpty()) {
      throw new MuseumNotFoundException();
    }

    return closerMuseum.get();
  }

  @Override
  public Museum createMuseum(Museum museum) {
    if (!CoordinateUtil.isCoordinateValid(museum.getCoordinate())) {
      throw new InvalidCoordinateException();
    }
    return museumFakeDatabase.saveMuseum(museum);
  }

  @Override
  public Museum getMuseum(Long id) {

    Optional<Museum> getMuseumById = museumFakeDatabase.getMuseum(id);
    if (getMuseumById.isEmpty()) {
      throw new MuseumNotFoundException();
    }
    return getMuseumById.get();
  }

  @Override
  public Museum deleteMuseum(Long id) {
    Museum delete = museumFakeDatabase.deleteMuseum(id);
    return delete;
  }
}
