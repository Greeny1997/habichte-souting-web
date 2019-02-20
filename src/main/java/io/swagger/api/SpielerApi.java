/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Spieler;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T16:25:36.526Z")

@Api(value = "spieler", description = "the spieler API")
public interface SpielerApi {

    @ApiOperation(value = "Create spieler", nickname = "createSpieler", notes = "", response = Spieler.class, responseContainer = "List", authorizations = {
        @Authorization(value = "habicht_auth", scopes = {
            @AuthorizationScope(scope = "read:scout", description = "read your pets"),
            @AuthorizationScope(scope = "write:scout", description = "modify pets in your account")
            })
    }, tags={ "spieler", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Spieler.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Scout not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/spieler",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<Spieler>> createSpieler(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Spieler body);


    @ApiOperation(value = "Delete spieler by ID", nickname = "deleteSpieler", notes = "For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors", tags={ "spieler", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Spieler not found") })
    @RequestMapping(value = "/spieler/{spielerid}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSpieler(@Min(1L)@ApiParam(value = "ID of the spieler that needs to be deleted",required=true) @PathVariable("spielerid") Long spielerid);


    @ApiOperation(value = "Find spieler by ID", nickname = "getSpielerById", notes = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions", response = Spieler.class, tags={ "spieler", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Spieler.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Spieler not found") })
    @RequestMapping(value = "/spieler/{spielerid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Spieler> getSpielerById(@Min(1L) @Max(10L) @ApiParam(value = "ID of spieler that needs to be fetched",required=true) @PathVariable("spielerid") Long spielerid);


    @ApiOperation(value = "Find spieler by Searchstring", nickname = "getSpielerBySearchstring", notes = "", response = Spieler.class, responseContainer = "List", tags={ "spieler", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Spieler.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Spieler not found") })
    @RequestMapping(value = "/spieler/Suche/{searchstring}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Spieler>> getSpielerBySearchstring(@ApiParam(value = "ID of spieler that needs to be fetched",required=true) @PathVariable("searchstring") String searchstring);


    @ApiOperation(value = "Update an existing spieler", nickname = "updateSpieler", notes = "", authorizations = {
        @Authorization(value = "habicht_auth", scopes = {
            @AuthorizationScope(scope = "read:scout", description = "read your pets"),
            @AuthorizationScope(scope = "write:scout", description = "modify pets in your account")
            })
    }, tags={ "spieler", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Scout not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/spieler/{spielerid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateSpieler(@Min(1L) @Max(10L) @ApiParam(value = "ID of scout that needs to be fetched",required=true) @PathVariable("spielerid") Long spielerid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Spieler body);

}