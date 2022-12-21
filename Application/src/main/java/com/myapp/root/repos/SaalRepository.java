import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SaalRepository extends CrudRepository<Customer, Long> {

    List<Saal> findByAnzahlPlätze(int AnzahlPlätze);

    Saal findById(int id);
}