package com.it.repository;

import com.it.model.Walls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WallsRepository  extends JpaRepository<Walls, Long> {

}
