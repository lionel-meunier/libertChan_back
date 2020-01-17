package kaboni.libertchan.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaboni.libertchan.models.ConnectedUser;

@Repository
public interface ConnectedUserJpaRepository extends JpaRepository<ConnectedUser, Integer> {
	public Optional<ConnectedUser> findByEmail(String email);
	public Optional<ConnectedUser> findById(Long id);
	public List<ConnectedUser> findAll();
}