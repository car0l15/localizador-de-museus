package com.betrybe.museumfinder.model;

/**
 * The type Museum.
 */
public class Museum {
  private Long id;
  private String name;

  private String description;

  private String address;

  private String collectionType;
  private String subject;

  private String url;

  private Coordinate coordinate;

  private Long legacyId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }

  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  public Long getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
