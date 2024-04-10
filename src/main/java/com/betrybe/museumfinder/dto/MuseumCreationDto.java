package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * The type MuseumCreationDto.
 */
public record MuseumCreationDto(String name, String description, String addres,
                        String collectionType, String subject, String url,
                        Coordinate coordinate) {

}
