package de.jinou.habichtescouting.server.api.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Spieler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T16:25:36.526Z")

@Controller
public class SpielerApiController implements SpielerApi {

    private static final Logger log = LoggerFactory.getLogger(SpielerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SpielerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Spieler>> createSpieler(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Spieler body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Spieler>>(objectMapper.readValue("[ {  \"spielernummer\" : 6,  \"verein\" : \"verein\",  \"name\" : \"name\",  \"angelegtAm\" : 1,  \"id\" : 0,  \"position\" : \"position\",  \"beschreibung\" : \"beschreibung\"}, {  \"spielernummer\" : 6,  \"verein\" : \"verein\",  \"name\" : \"name\",  \"angelegtAm\" : 1,  \"id\" : 0,  \"position\" : \"position\",  \"beschreibung\" : \"beschreibung\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Spieler>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Spieler>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteSpieler(@Min(1L)@ApiParam(value = "ID of the spieler that needs to be deleted",required=true) @PathVariable("spielerid") Long spielerid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Spieler> getSpielerById(@Min(1L) @Max(10L) @ApiParam(value = "ID of spieler that needs to be fetched",required=true) @PathVariable("spielerid") Long spielerid) {
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

    public ResponseEntity<List<Spieler>> getSpielerBySearchstring(@ApiParam(value = "ID of spieler that needs to be fetched",required=true) @PathVariable("searchstring") String searchstring) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Spieler>>(objectMapper.readValue("[ {  \"spielernummer\" : 6,  \"verein\" : \"verein\",  \"name\" : \"name\",  \"angelegtAm\" : 1,  \"id\" : 0,  \"position\" : \"position\",  \"beschreibung\" : \"beschreibung\"}, {  \"spielernummer\" : 6,  \"verein\" : \"verein\",  \"name\" : \"name\",  \"angelegtAm\" : 1,  \"id\" : 0,  \"position\" : \"position\",  \"beschreibung\" : \"beschreibung\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Spieler>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Spieler>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateSpieler(@Min(1L) @Max(10L) @ApiParam(value = "ID of scout that needs to be fetched",required=true) @PathVariable("spielerid") Long spielerid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Spieler body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
