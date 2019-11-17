package net.lab0.azure.symbol.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.symbol.model.definition.DebugEntryCreateBatch
import net.lab0.azure.symbol.model.definition.Request
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RequestsApi {
  /**
   * Get a symbol request by request name.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/symbol/requests")
  fun getRequestsRequestName(
    @Path("organization") organization: String,
    @Query("requestName") requestName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a new symbol request.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/symbol/requests")
  fun createRequests(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Request
  ): Call<JsonValue>

  /**
   * Delete a symbol request by request name.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param synchronous If true, delete all the debug entries under this request synchronously in
   * the current session. If false, the deletion will be postponed to a later point and be executed
   * automatically by the system.
   */
  @DELETE("/{organization}/_apis/symbol/requests")
  fun deleteRequestsRequestName(
    @Path("organization") organization: String,
    @Query("requestName") requestName: String,
    @Query("synchronous") synchronous: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a symbol request by request name.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/symbol/requests")
  fun updateRequestsRequestName(
    @Path("organization") organization: String,
    @Query("requestName") requestName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Request
  ): Call<JsonValue>

  /**
   * Get a symbol request by request identifier.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param requestId The symbol request identifier.
   */
  @GET("/{organization}/_apis/symbol/requests/{requestId}")
  fun getRequestsRequestId(
    @Path("organization") organization: String,
    @Path("requestId") requestId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create debug entries for a symbol request as specified by its identifier.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param requestId The symbol request identifier.
   * @param collection A valid debug entry collection name. Must be "debugentries".
   */
  @POST("/{organization}/_apis/symbol/requests/{requestId}")
  fun createRequestsRequestIdDebugEntries(
    @Path("organization") organization: String,
    @Path("requestId") requestId: String,
    @Query("collection") collection: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: DebugEntryCreateBatch
  ): Call<JsonValue>

  /**
   * Delete a symbol request by request identifier.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param requestId The symbol request identifier.
   * @param synchronous If true, delete all the debug entries under this request synchronously in
   * the current session. If false, the deletion will be postponed to a later point and be executed
   * automatically by the system.
   */
  @DELETE("/{organization}/_apis/symbol/requests/{requestId}")
  fun deleteRequestsRequestId(
    @Path("organization") organization: String,
    @Path("requestId") requestId: String,
    @Query("synchronous") synchronous: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a symbol request by request identifier.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param requestId The symbol request identifier.
   */
  @PATCH("/{organization}/_apis/symbol/requests/{requestId}")
  fun updateRequestsRequestId(
    @Path("organization") organization: String,
    @Path("requestId") requestId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Request
  ): Call<JsonValue>
}
