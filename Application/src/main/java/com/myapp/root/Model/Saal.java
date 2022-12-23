import javax.persistence.*;
import jakarta.annotation.*;
import springframework.*;
import java.lang.annotation.*;




@Entity
public class Saal {
    @Id
    @column
    private int id;

    @Id
    @column
    private int anzahlplätze;


    public Saal(int id, int anzahlplätze) {
        this.id = id;

    }

    @Override
    public String toString() {
        return String.format(
                "Saal[id=%d, anzahlplätze='%s']",
                id, anzahlplätze);
    }

    public int getId() {
        return id;
    }

    public int getAnzahlplätze() {
        return anzahlplätze;
    }

}