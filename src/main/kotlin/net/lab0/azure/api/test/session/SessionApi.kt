package net.lab0.azure.api.test.session

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.TestSessionSource
import net.lab0.azure.model.definition.test.TestSession
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SessionApi {
  /**
   * Get a list of test sessions
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param period Period in days from now, for which test sessions are fetched.
   * @param allSessions If false, returns test sessions for current user. Otherwise, it returns test
   * sessions for all users
   * @param includeAllProperties If true, it returns all properties of the test sessions. Otherwise,
   * it returns the skinny version.
   * @param source Source of the test session.
   * @param includeOnlyCompletedSessions If true, it returns test sessions in completed state.
   * Otherwise, it returns test sessions for all states
   */
  @GET("/{organization}/{project}/{team}/_apis/test/session")
  fun getTestSessions(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("period") period: Int? = null,
    @Query("allSessions") allSessions: Boolean? = null,
    @Query("includeAllProperties") includeAllProperties: Boolean? = null,
    @Query("source") source: TestSessionSource? = null,
    @Query("includeOnlyCompletedSessions") includeOnlyCompletedSessions: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test session
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @POST("/{organization}/{project}/{team}/_apis/test/session")
  fun createTestSession(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestSession
  ): Call<JsonValue>

  /**
   * Update a test session
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/test/session")
  fun updateTestSession(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestSession
  ): Call<JsonValue>
}
