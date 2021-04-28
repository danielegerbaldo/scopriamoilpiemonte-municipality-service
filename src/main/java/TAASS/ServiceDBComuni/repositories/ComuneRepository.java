package TAASS.ServiceDBComuni.repositories;

import TAASS.ServiceDBComuni.models.Comune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComuneRepository extends JpaRepository<Comune, Long> {
}
