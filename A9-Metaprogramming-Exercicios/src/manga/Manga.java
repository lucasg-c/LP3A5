package manga;

import java.time.LocalDate;
import java.util.Optional;

enum Status
{
    RELEASING,
    FINISHED
}

enum Genre
{
    DRAMA,
    MYSTERY,
    PSYCHOLOGICAL,
    SUPERNATURAL,
    COMEDY,
    ROMANCE,
    ACTION,
    MECHA,
    SCIFI
}

public class Manga {
    private String name;
    private int chapters;
    private int volumes;
    private Status status;
    private LocalDate startDate;
    private Optional<LocalDate> endDate;
    private Genre genre;
    private String synopsis;

    public Manga(String name, int chapters, int volumes, Status status, LocalDate startDate, Optional<LocalDate> endDate, Genre genre, String synopsis) {
        this.name = name;
        this.chapters = chapters;
        this.volumes = volumes;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Optional<LocalDate> getEndDate() {
        return endDate;
    }

    public void setEndDate(Optional<LocalDate> endDate) {
        this.endDate = endDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
