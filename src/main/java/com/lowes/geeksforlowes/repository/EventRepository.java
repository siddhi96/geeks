package com.lowes.geeksforlowes.repository;

import com.lowes.geeksforlowes.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    boolean exists(Integer eventId);
}
