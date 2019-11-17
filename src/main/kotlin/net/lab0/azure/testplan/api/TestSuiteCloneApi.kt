package net.lab0.azure.testplan.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.testplan.model.definition.CloneTestSuiteParams
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TestSuiteCloneApi {
  /**
   * Clone test suite
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deepClone Clones all the associated test cases as well. False by default.
   */
  @POST("/{organization}/{project}/_apis/testplan/Suites/CloneOperation")
  fun cloneTestSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("deepClone") deepClone: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: CloneTestSuiteParams
  ): Call<JsonValue>

  /**
   * Get suite clone information.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param cloneOperationId Operation ID returned when we queue a clone operation
   */
  @GET("/{organization}/{project}/_apis/testplan/Suites/CloneOperation/{cloneOperationId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("cloneOperationId") cloneOperationId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
