package com.mainfilms.mainfilms.repo;

import com.mainfilms.mainfilms.models.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
