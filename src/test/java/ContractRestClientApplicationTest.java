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

    //Testing - TORINO
    @Test
    public void check_comune_nome() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getNome()).isEqualTo("Torino");
    }
    @Test
    public void check_comune_provincia() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getProvincia()).isEqualTo("TO");
    }
    @Test
    public void check_comune_regione() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getRegione()).isEqualTo("Piemonte");
    }
    @Test
    public void check_comune_cap() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getCAP()).isEqualTo("10121-10156");
    }
    @Test
    public void check_comune_lat() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getLat()).isEqualTo(45.0732745);
    }
    @Test
    public void check_comune_lng() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/1272",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getLng()).isEqualTo(7.68068748);
    }

    //Testing - ROMA
    @Test
    public void check_comune_nome_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getNome()).isEqualTo("Roma");
    }
    @Test
    public void check_comune_provincia_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getProvincia()).isEqualTo("RM");
    }
    @Test
    public void check_comune_regione_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getRegione()).isEqualTo("Lazio");
    }
    @Test
    public void check_comune_cap_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getCAP()).isEqualTo("00118-00199");
    }
    @Test
    public void check_comune_lat_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getLat()).isEqualTo(41.89277044);
    }
    @Test
    public void check_comune_lng_1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comune> comuneResponseEntity = restTemplate.getForEntity("http://localhost/api/v1/comune/info-comune/58091",Comune.class);
        Assertions.assertThat(comuneResponseEntity).isNotNull();
        BDDAssertions.then(comuneResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(comuneResponseEntity.getBody().getLng()).isEqualTo(12.48366723);
    }
}
