package dev.manohar.splitwise.repository;

import dev.manohar.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
