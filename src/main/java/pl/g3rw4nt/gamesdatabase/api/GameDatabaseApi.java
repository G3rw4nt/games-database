package pl.g3rw4nt.gamesdatabase.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.g3rw4nt.gamesdatabase.dao.entity.Game;
import pl.g3rw4nt.gamesdatabase.manager.GameManager;
import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GameDatabaseApi {

    private GameManager games;

    @Autowired
    public GameDatabaseApi(GameManager games)
    {
        this.games = games;
    }

    @GetMapping("/all")
    public Iterable<Game> getAll()
    {
        return games.findAll();
    }

    @GetMapping
    public Optional<Game> getById(@RequestParam int id)
    {

        return games.findById(id);
    }

    @PostMapping
    public Game addGame(@RequestBody Game game)
    {
        return games.save(game);
    }

    @PutMapping
    public Game updateGame(@RequestBody Game game)
    {
        return games.save(game);
    }

    @DeleteMapping
    public void deleteGame(@RequestParam int id)
    {
        games.deleteById(id);
    }

}
