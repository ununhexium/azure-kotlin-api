package net.lab0.azure.api.git.importrequests

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitImportRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun queryImportRequests(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("includeAbandoned") includeAbandoned: Boolean? = null,
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
  fun createImportRequest(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getImportRequest(
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
  fun updateImportRequest(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Path("importRequestId") importRequestId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitImportRequest
  ): Call<JsonValue>
}
