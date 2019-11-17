package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.RunCreateModel
import net.lab0.azure.test.model.definition.RunUpdateModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RunsApi {
  /**
   * Get a list of test runs.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param buildUri URI of the build that the runs used.
   * @param owner Team foundation ID of the owner of the runs.
   * @param planId ID of the test plan that the runs are a part of.
   * @param includeRunDetails If true, include all the properties of the runs.
   * @param automated If true, only returns automated runs.
   * @param skip Number of test runs to skip.
   * @param top Number of test runs to return.
   */
  @GET("/{organization}/{project}/_apis/test/runs")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("buildUri") buildUri: String,
    @Query("owner") owner: String,
    @Query("tmiRunId") tmiRunId: String,
    @Query("planId") planId: Int,
    @Query("includeRunDetails") includeRunDetails: Boolean,
    @Query("automated") automated: Boolean,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create new test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/test/runs")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: RunCreateModel
  ): Call<JsonValue>

  /**
   * Get a test run by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the run to get.
   * @param includeDetails Defualt value is true. It includes details like run
   * statistics,release,build,Test enviornment,Post process state and more
   */
  @GET("/{organization}/{project}/_apis/test/runs/{runId}")
  fun getTestRunById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("includeDetails") includeDetails: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a test run by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the run to delete.
   */
  @DELETE("/{organization}/{project}/_apis/test/runs/{runId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update test run by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the run to update.
   */
  @PATCH("/{organization}/{project}/_apis/test/runs/{runId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: RunUpdateModel
  ): Call<JsonValue>

  /**
   * Get test run statistics
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the run to get.
   */
  @GET("/{organization}/{project}/_apis/test/runs/{runId}/Statistics")
  fun getTestRunStatistics(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
