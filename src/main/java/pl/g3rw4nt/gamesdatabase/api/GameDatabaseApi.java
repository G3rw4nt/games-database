package pl.g3rw4nt.gamesdatabase.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.g3rw4nt.gamesdatabase.dao.entity.Game;
import pl.g3rw4nt.gamesdatabase.manager.GameManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GameDatabaseApi {
    private GameManager games;

    @Autowired
    public GameDatabaseApi(GameManager gameManager)
    {
        this.games = gameManager;
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
    public Game addGame(@RequestBody Game gameTemp)
    {
        return games.save(gameTemp);
    }

    @PutMapping
    public Game updateGame(@RequestBody Game gameTemp)
    {
        return games.save(gameTemp);
    }

    @DeleteMapping
    public void deleteGame(@RequestParam int id)
    {
        games.deleteById(id);
    }

}
