package pl.g3rw4nt.gamesdatabase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.g3rw4nt.gamesdatabase.dao.entity.Game;

@Repository
public interface GameRepo extends CrudRepository<Game, Integer> {
}
