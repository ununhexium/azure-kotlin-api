package net.lab0.azure.api.test.codecoverage

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CodeCoverageApi {
  /**
   * Get code coverage data for a build.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param buildId ID of the build for which code coverage data needs to be fetched.
   * @param flags Value of flags determine the level of code coverage details to be fetched. Flags
   * are additive. Expected Values are 1 for Modules, 2 for Functions, 4 for BlockData.
   */
  @GET("/{organization}/{project}/_apis/test/codecoverage")
  fun getBuildCodeCoverage(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("buildId") buildId: Int,
    @Query("flags") flags: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get code coverage data for a test run
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run for which code coverage data needs to be fetched.
   * @param flags Value of flags determine the level of code coverage details to be fetched. Flags
   * are additive. Expected Values are 1 for Modules, 2 for Functions, 4 for BlockData.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/codecoverage")
  fun getTestRunCodeCoverage(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("flags") flags: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
