package dev.manohar.splitwise.repository;

import dev.manohar.splitwise.models.Group;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
