package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.test.model.definition.TestHistoryQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TestHistoryApi {
  /**
   * Get history of a test method using TestHistoryQuery
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/test/Results/testhistory")
  fun query(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestHistoryQuery
  ): Call<JsonValue>
}
