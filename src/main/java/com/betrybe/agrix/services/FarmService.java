package com.betrybe.agrix.services;

import com.betrybe.agrix.exceptions.NotFoundException;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmService {

  private final FarmRepository farmRepository;

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  public Farm insertFarm(Farm farm) {
    return this.farmRepository.save(farm);
  }

  public List<Farm> getAllFarms() {
    return this.farmRepository.findAll();
  }

  public Optional<Farm> getFarmById(Long id) {
    Optional<Farm> optionalFarm = this.farmRepository.findById(id);

    if (optionalFarm.isEmpty()) {
      throw new NotFoundException("Fazenda não encontrada!");
    }

    return optionalFarm;
  }
}
