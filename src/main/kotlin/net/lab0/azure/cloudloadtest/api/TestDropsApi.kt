package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.TestDrop
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TestDropsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/clt/testdrops")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TestDrop
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testDropId The test drop identifier
   */
  @GET("/{organization}/_apis/clt/testdrops/{testDropId}")
  fun get(
    @Path("organization") organization: String,
    @Path("testDropId") testDropId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
