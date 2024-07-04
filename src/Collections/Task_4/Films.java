package Collections.Task_4;

import java.util.ArrayList;
import java.util.Objects;

public class Films {

    private String films;

    public Films(String films) {
        this.films = films;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Films films1 = (Films) o;
        return Objects.equals(films, films1.films);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(films);
    }

    @Override
    public String toString() {
        return films;
    }
}
