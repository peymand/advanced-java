import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.kaheshan.dummy.model.Customer;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;

public class RestClientTest {


    @Test
    public void restTemplateGetCustomer(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/demo/rest/customer";
        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<Customer> response
                = restTemplate.getForEntity(fooResourceUrl + "/2", Customer.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }


    @Test
    public void restTemplatePostCustomer() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String createCustomerUrl = "http://localhost:8080/demo/rest/customer";
        String updateCustomerUrl = "http://localhost:8080/rest/customer";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        JsonObject personJsonObject = new JsonObject();
        personJsonObject.addProperty("firstName", "peyman");
        personJsonObject.addProperty("lastName", "dodangeh");
        personJsonObject.addProperty("email", "dodangeh@ce.sharif.ir");

        HttpEntity<String> request =
                new HttpEntity<String>(personJsonObject.toString(), headers);

        String personResultAsJsonStr =
                restTemplate.postForObject(createCustomerUrl, request, String.class);

        JsonNode root = objectMapper.readTree(personResultAsJsonStr);

        assertNotNull(personResultAsJsonStr);
        assertNotNull(root);
        assertNotNull(root.path("value").asText());

    }

}
