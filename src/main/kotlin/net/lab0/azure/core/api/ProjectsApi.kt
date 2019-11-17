package net.lab0.azure.core.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.core.model.definition.TeamProject
import net.lab0.azure.core.model.definition.enumeration.ProjectState
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ProjectsApi {
  /**
   * Get all projects in the organization that the authenticated user has access to.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param stateFilter Filter on team projects in a specific team project state (default:
   * WellFormed).
   */
  @GET("/{organization}/_apis/projects")
  fun list(
    @Path("organization") organization: String,
    @Query("stateFilter") stateFilter: ProjectState,
    @Query("${'$'}top") top: Int,
    @Query("${'$'}skip") skip: Int,
    @Query("continuationToken") continuationToken: String,
    @Query("getDefaultTeamImageUrl") getDefaultTeamImageUrl: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Queues a project to be created. Use the [GetOperation](../../operations/operations/get) to
   * periodically check for create project status.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/projects")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TeamProject
  ): Call<JsonValue>

  /**
   * Get project with the specified id or name, optionally including capabilities.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param includeCapabilities Include capabilities (such as source control) in the team project
   * result (default: false).
   * @param includeHistory Search within renamed projects (that had such name in the past).
   */
  @GET("/{organization}/_apis/projects/{projectId}")
  fun get(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("includeCapabilities") includeCapabilities: Boolean,
    @Query("includeHistory") includeHistory: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Queues a project to be deleted. Use the [GetOperation](../../operations/operations/get) to
   * periodically check for delete project status.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The project id of the project to delete.
   */
  @DELETE("/{organization}/_apis/projects/{projectId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update an existing project's name, abbreviation, or description.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The project id of the project to update.
   */
  @PATCH("/{organization}/_apis/projects/{projectId}")
  fun update(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TeamProject
  ): Call<JsonValue>
}
