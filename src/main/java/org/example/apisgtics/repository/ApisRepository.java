package org.example.apisgtics.repository;

import com.example.apisgtics.model.Apis;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApisRepository extends JpaRepository<Apis, Long> {

    List<Apis> findByFirstName(String nombre);

}