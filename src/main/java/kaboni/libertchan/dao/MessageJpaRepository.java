package kaboni.libertchan.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaboni.libertchan.models.DiscussionThread;
import kaboni.libertchan.models.Message;

@Repository
public interface MessageJpaRepository extends JpaRepository<Message, Long> {
	public Optional<Message> findByPostNumber(Long postNumber);
	public List<Message> findAllByOrderByDateDesc();
	public List<Message> findByDiscussionThread(DiscussionThread discussionThread);

//	TODO: faire une methode <find last 5 messages> avec query definie: 
	// Utiliser 'limit +/-5' @Query("SELECT * FROM foo ORDER BY date ASC")

	
}
