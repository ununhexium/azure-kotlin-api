package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitImportRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ImportRequestsApi {
  /**
   * Retrieve import requests for a repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The name or ID of the repository.
   * @param includeAbandoned True to include abandoned import requests in the results.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests")
  fun query(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("includeAbandoned") includeAbandoned: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create an import request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The name or ID of the repository.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitImportRequest
  ): Call<JsonValue>

  /**
   * Retrieve a particular import request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The name or ID of the repository.
   * @param importRequestId The unique identifier for the import request.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests/{importRequestId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Path("importRequestId") importRequestId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Retry or abandon a failed import request.
   *
   * There can only be one active import request associated with a repository. Marking a failed
   * import request abandoned makes it inactive.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The name or ID of the repository.
   * @param importRequestId The unique identifier for the import request to update.
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests/{importRequestId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Path("importRequestId") importRequestId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitImportRequest
  ): Call<JsonValue>
}
