package net.lab0.azure.operations.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OperationsApi {
  /**
   * Gets an operation from the the operationId using the given pluginId.
   *
   * Some scenarios don’t require a pluginId. If a pluginId is not included in the call then just
   * the operationId will be used to find an operation.
   *
   * @param operationId The ID for the operation.
   * @param organization The name of the Azure DevOps organization.
   * @param pluginId The ID for the plugin.
   */
  @GET("/{organization}/_apis/operations/{operationId}")
  fun get(
    @Path("operationId") operationId: String,
    @Path("organization") organization: String,
    @Query("pluginId") pluginId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
