/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Scout;
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

@Api(value = "scout", description = "the scout API")
public interface ScoutApi {

    @ApiOperation(value = "Logs user into the system", nickname = "loginScout", notes = "", response = String.class, tags={ "scout", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid email/password supplied") })
    @RequestMapping(value = "/scout/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginScout(@NotNull @ApiParam(value = "The scout email for login", required = true) @Valid @RequestParam(value = "email", required = true) String email,@NotNull @ApiParam(value = "The password for login", required = true) @Valid @RequestParam(value = "password", required = true) String password);


    @ApiOperation(value = "Logs out current logged in scout session", nickname = "logoutScout", notes = "", tags={ "scout", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/scout/logout",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutScout();


    @ApiOperation(value = "Update an existing profil", nickname = "updateBenachrichtigung", notes = "", authorizations = {
        @Authorization(value = "habicht_auth", scopes = {
            @AuthorizationScope(scope = "read:scout", description = "read your pets"),
            @AuthorizationScope(scope = "write:scout", description = "modify pets in your account")
            })
    }, tags={ "scout", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Scout not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/scout/benachrichtigung/{scoutid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateBenachrichtigung(@Min(1L) @Max(10L) @ApiParam(value = "ID of scout that needs to be fetched",required=true) @PathVariable("scoutid") Long scoutid,@ApiParam(value = "Benachrichtigung a 1 aus 0" ,required=true )  @Valid @RequestBody Integer body);


    @ApiOperation(value = "Update an existing profil", nickname = "updateScout", notes = "", authorizations = {
        @Authorization(value = "habicht_auth", scopes = {
            @AuthorizationScope(scope = "read:scout", description = "read your pets"),
            @AuthorizationScope(scope = "write:scout", description = "modify pets in your account")
            })
    }, tags={ "scout", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Scout not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/scout/profil/{scoutid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateScout(@Min(1L) @Max(10L) @ApiParam(value = "ID of scout that needs to be fetched",required=true) @PathVariable("scoutid") Long scoutid,@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Scout body);

}