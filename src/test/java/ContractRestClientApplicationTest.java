import TAASS.ServiceDBComuni.models.Comune;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerExtension;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ContractRestClientApplicationTest {
    @RegisterExtension
    public StubRunnerExtension stubRunner = new StubRunnerExtension()
            .downloadStub("com.example", "contract-rest-service", "0.0.1-SNAPSHOT", "stubs")
            .stubsMode(StubRunnerProperties.StubsMode.LOCAL);

    @Test
    public void check_comune_nome() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> personResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1006",Comune.class);
        Assertions.assertThat(personResponseEntity).isNotNull();
        BDDAssertions.then(personResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(personResponseEntity.getBody().getNome()).isEqualTo("Almese");
    }

    @Test
    public void check_comune_provincia() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> personResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1006",Comune.class);
        Assertions.assertThat(personResponseEntity).isNotNull();
        BDDAssertions.then(personResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(personResponseEntity.getBody().getProvincia()).isEqualTo("TO");
    }
}
