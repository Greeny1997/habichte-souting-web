package de.jinou.habichtescouting.server.api.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Spieler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T16:25:36.526Z")

@Controller
public class NeuespielerApiController implements NeuespielerApi {

    private static final Logger log = LoggerFactory.getLogger(NeuespielerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NeuespielerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Spieler> neuespielerGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Spieler>(objectMapper.readValue("{  \"spielernummer\" : 6,  \"verein\" : \"verein\",  \"name\" : \"name\",  \"angelegtAm\" : 1,  \"id\" : 0,  \"position\" : \"position\",  \"beschreibung\" : \"beschreibung\"}", Spieler.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Spieler>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Spieler>(HttpStatus.NOT_IMPLEMENTED);
    }

}
