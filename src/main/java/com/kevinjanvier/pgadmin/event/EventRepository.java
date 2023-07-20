package com.kevinjanvier.pgadmin.event;

import org.springframework.data.repository.ListCrudRepository;

public interface EventRepository extends ListCrudRepository<Event, Integer> {
}
