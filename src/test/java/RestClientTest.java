import com.kaheshan.dummy.model.Customer;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestClientTest {


    @Test
    public void restTemplateCheck(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/rest/customer";
        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<Customer> response
                = restTemplate.getForEntity(fooResourceUrl + "/18", Customer.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
