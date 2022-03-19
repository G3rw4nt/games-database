package pl.g3rw4nt.gamesdatabase;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GameDatabaseApi {
    private List<Game> games;
    public GameDatabaseApi()
    {
        games = new ArrayList<Game>();
        games.add(new Game(0,"Grand Theft Auto V","Playstation 5","Action", "PAL", LocalDate.of(2022,3,15),85));
        games.add(new Game(1,"Forza Horizon 5","Xbox Series X","Racing", "PAL", LocalDate.of(2021,11,11),91));
        games.add(new Game(2,"Super Mario Odyssey","Nintendo Switch","Platformer", "NTSC-J", LocalDate.of(2017,12,10),92));
        games.add(new Game(3,"FIFA 22","Playstation 5","Sport", "PAL", LocalDate.of(2022,1,10),86));
    }
    @GetMapping("/all")
    public List<Game> getAll()
    {
        return games;
    }

    @GetMapping
    public Game getById(@RequestParam long id)
    {
        Optional<Game> first = games.stream().filter(element -> element.getId() == id).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addGame(@RequestBody Game gameTemp)
    {
        return games.add(gameTemp);
    }

    @PutMapping
    public boolean updateGame(@RequestBody Game gameTemp)
    {
        return games.add(gameTemp);
    }

    @DeleteMapping
    public boolean deleteGame(@RequestParam int id)
    {
        return games.removeIf(element -> element.getId() == id);
    }

}
