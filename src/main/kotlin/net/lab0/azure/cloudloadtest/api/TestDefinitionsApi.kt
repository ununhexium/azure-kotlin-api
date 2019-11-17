package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.TestDefinition
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface TestDefinitionsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param fromDate Date after which test definitions were created
   * @param toDate Date before which test definitions were crated
   */
  @GET("/{organization}/_apis/clt/testdefinitions")
  fun list(
    @Path("organization") organization: String,
    @Query("fromDate") fromDate: String,
    @Query("toDate") toDate: String,
    @Query("top") top: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PUT("/{organization}/_apis/clt/testdefinitions")
  fun update(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TestDefinition
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/clt/testdefinitions")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TestDefinition
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testDefinitionId The test definition identifier
   */
  @GET("/{organization}/_apis/clt/testdefinitions/{testDefinitionId}")
  fun get(
    @Path("organization") organization: String,
    @Path("testDefinitionId") testDefinitionId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
