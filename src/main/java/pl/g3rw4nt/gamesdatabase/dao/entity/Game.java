package pl.g3rw4nt.gamesdatabase.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String platform;
    private String genre;
    private String region;
    private LocalDate releasedate;
    private int metascore;

    public Game()
    {


    }

    public Game(String title, String platform, String genre, String region, LocalDate releasedate, int metascore) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.region = region;
        this.releasedate = releasedate;
        this.metascore = metascore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(LocalDate releaseDate) {
        this.releasedate = releaseDate;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public String getRegion() {return region;}

    public void setRegion(String region) {this.region = region;}


}
