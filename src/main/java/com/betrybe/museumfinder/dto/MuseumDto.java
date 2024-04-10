package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * The type MuseumDto.
 */
public record MuseumDto(Long id, String name, String description, String addres,
                        String collectionType, String subject, String url,
                        Coordinate coordinate) {

}
