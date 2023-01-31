package io.swagger.api;

import io.swagger.model.Cloud;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-31T16:57:09.985Z[GMT]")
@RestController
public class CloudsApiController implements CloudsApi {

    private static final Logger log = LoggerFactory.getLogger(CloudsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CloudsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> cancelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId,@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cloud> createCloudForUser(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cloud body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cloud>(objectMapper.readValue("{\n  \"duration\" : 3,\n  \"OS\" : \"Windows\",\n  \"CPU\" : 4,\n  \"HDD\" : 1024,\n  \"cloud_id\" : 134,\n  \"RAM\" : 16\n}", Cloud.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cloud>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cloud>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cloud> getCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId,@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cloud>(objectMapper.readValue("{\n  \"duration\" : 3,\n  \"OS\" : \"Windows\",\n  \"CPU\" : 4,\n  \"HDD\" : 1024,\n  \"cloud_id\" : 134,\n  \"RAM\" : 16\n}", Cloud.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cloud>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cloud>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Cloud>> getCloudsForCustomerId(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Cloud>>(objectMapper.readValue("[ {\n  \"duration\" : 3,\n  \"OS\" : \"Windows\",\n  \"CPU\" : 4,\n  \"HDD\" : 1024,\n  \"cloud_id\" : 134,\n  \"RAM\" : 16\n}, {\n  \"duration\" : 3,\n  \"OS\" : \"Windows\",\n  \"CPU\" : 4,\n  \"HDD\" : 1024,\n  \"cloud_id\" : 134,\n  \"RAM\" : 16\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Cloud>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Cloud>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cloud> updateCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId,@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cloud body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cloud>(objectMapper.readValue("{\n  \"duration\" : 3,\n  \"OS\" : \"Windows\",\n  \"CPU\" : 4,\n  \"HDD\" : 1024,\n  \"cloud_id\" : 134,\n  \"RAM\" : 16\n}", Cloud.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cloud>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cloud>(HttpStatus.NOT_IMPLEMENTED);
    }

}
