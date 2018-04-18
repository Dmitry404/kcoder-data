package io.katacoder.repositories;

import io.katacoder.domain.Exercise;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface ExercisesRepository extends ReactiveMongoRepository<Exercise, String> {
}

