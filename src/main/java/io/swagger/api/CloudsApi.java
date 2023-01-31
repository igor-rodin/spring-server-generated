/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.39).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cloud;
import io.swagger.model.Error;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-31T16:57:09.985Z[GMT]")
@Validated
public interface CloudsApi {

    @Operation(summary = "Метод отмены заказа на ресурс cloud_id для клиента client_id", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ заказом облака по ID"),
        
        @ApiResponse(responseCode = "400", description = "Некорректный запрос. Возвращает некорректный запрос", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Ресурс с не найден", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "5XX", description = "Ошибка сервера. Возвращант описание ошибки", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{client_id}/{cloud_id}",
        produces = { "adplication/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> cancelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId, @Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId);


    @Operation(summary = "Метод создания заказа на ресурсы облака для клиента client_id", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Заказа на облачные ресурсы успешно создан", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "400", description = "Некорректный запрос. Возвращает некорректный запрос", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "5XX", description = "Ошибка сервера. Возвращант описание ошибки", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{client_id}",
        produces = { "adplication/json" }, 
        consumes = { "adplication/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Cloud> createCloudForUser(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cloud body);


    @Operation(summary = "Метод получения данных о ресурce cloud_id для клиента client_id", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Запрос выполнен успешно", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "400", description = "Некорректный запрос. Возвращает некорректный запрос", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Ресурс не найден", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "5XX", description = "Ошибка сервера. Возвращант описание ошибки", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{client_id}/{cloud_id}",
        produces = { "adplication/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cloud> getCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId, @Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId);


    @Operation(summary = "Метод получения списка всех арендованных облачных ресурсов клиента client_id", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком арендованных ресурсов", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Cloud.class)))),
        
        @ApiResponse(responseCode = "5XX", description = "Ошибка сервера. Возвращант описание ошибки", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{client_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Cloud>> getCloudsForCustomerId(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId);


    @Operation(summary = "Метод изменения заказа на ресурс cloud_id дляклиента client_id", description = "Обновляет заказ на облачные ресурсы", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Заказ успешно обновлен", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "400", description = "Некорректный запрос. Возвращает некорректный запрос", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Ресурс с указанным cloud_id не найден", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "5XX", description = "Ошибка сервера. Возвращант описание ошибки", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/clouds/{client_id}/{cloud_id}",
        produces = { "adplication/json" }, 
        consumes = { "adplication/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Cloud> updateCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор клиента", required=true, schema=@Schema()) @PathVariable("client_id") Integer clientId, @Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") Integer cloudId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cloud body);

}
