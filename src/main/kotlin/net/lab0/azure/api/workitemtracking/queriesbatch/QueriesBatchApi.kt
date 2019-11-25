package net.lab0.azure.api.workitemtracking.queriesbatch

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.QueryBatchGetRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface QueriesBatchApi {
  /**
   * Gets a list of queries by ids (Maximum 1000)
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/wit/queriesbatch")
  fun getQueriesBatch(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: QueryBatchGetRequest
  ): Call<JsonValue>
}
