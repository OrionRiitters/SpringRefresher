package com.orionriitters.repository;

import com.orionriitters.entity.GenericObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GenericObjectRepository extends CrudRepository<GenericObject, Long> {
    List<GenericObject> findByName(String name);
}
