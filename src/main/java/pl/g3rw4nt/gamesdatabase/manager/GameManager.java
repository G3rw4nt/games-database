package pl.g3rw4nt.gamesdatabase.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.g3rw4nt.gamesdatabase.dao.GameRepo;
import pl.g3rw4nt.gamesdatabase.dao.entity.Game;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class GameManager {
    private GameRepo gameRepo;

    @Autowired
    public GameManager(GameRepo gameRepo)
    {
        this.gameRepo = gameRepo;
    }
    public Optional<Game> findById(int id)
    {
        return gameRepo.findById(id);
    }
    public Iterable<Game> findAll()
    {
        return gameRepo.findAll();
    }
    public Game save(Game game)
    {
        return gameRepo.save(game);
    }
    public void deleteById(int id)
    {
        gameRepo.deleteById(id);
    }

    @EventListener()
    public void fillDB()
    {
        save(new Game(0,"Grand Theft Auto V","Playstation 5","Action", "PAL", LocalDate.of(2022,3,15),85));
        save(new Game(1,"Forza Horizon 5","Xbox Series X","Racing", "PAL", LocalDate.of(2021,11,11),91));
        save(new Game(2,"Super Mario Odyssey","Nintendo Switch","Platformer", "NTSC-J", LocalDate.of(2017,12,10),92));
        save(new Game(3,"FIFA 22","Playstation 5","Sport", "PAL", LocalDate.of(2022,1,10),86));
    }
}
