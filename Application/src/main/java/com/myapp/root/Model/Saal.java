import jakarta.persistence.*;

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
                "Customer[id=%d, anzahlplätze='%s', lastName='%s']",
                id, anzahlplätze);
    }

    public int getId() {
        return id;
    }

    public int getAnzahlplätze() {
        return anzahlplätze;
    }

}