package net.lab0.azure.api.core.projects

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.core.TeamProject
import net.lab0.azure.model.definition.enumeration.core.ProjectState
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getProjects(
    @Path("organization") organization: String,
    @Query("stateFilter") stateFilter: ProjectState? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("getDefaultTeamImageUrl") getDefaultTeamImageUrl: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Queues a project to be created. Use the [GetOperation](../../operations/operations/get) to
   * periodically check for create project status.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/projects")
  fun queueCreateProject(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getProject(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("includeCapabilities") includeCapabilities: Boolean? = null,
    @Query("includeHistory") includeHistory: Boolean? = null,
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
  fun queueDeleteProject(
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
  fun updateProject(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TeamProject
  ): Call<JsonValue>
}
