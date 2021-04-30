package TAASS.ServiceDBComuni.repositories;

import TAASS.ServiceDBComuni.models.Comune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComuneRepository extends JpaRepository<Comune, Long> {

    Comune findByIstat(long istat);
}
