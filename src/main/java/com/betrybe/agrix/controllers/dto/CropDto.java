package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;

public record CropDto(Long id, String name, Double plantedArea, Farm farm) {

  public Crop toCrop() {
    return new Crop(id, name, plantedArea, farm);
  }
}
