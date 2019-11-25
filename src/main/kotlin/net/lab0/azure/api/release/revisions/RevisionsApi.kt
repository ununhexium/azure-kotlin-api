package net.lab0.azure.api.release.revisions

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RevisionsApi {
  /**
   * Get revision history for a release definition
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param definitionId Id of the definition.
   */
  @GET("/{organization}/{project}/_apis/Release/definitions/{definitionId}/revisions")
  fun getReleaseDefinitionHistory(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("definitionId") definitionId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get release definition for a given definitionId and revision
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param definitionId Id of the definition.
   * @param revision Id of the revision.
   */
  @GET("/{organization}/{project}/_apis/Release/definitions/{definitionId}/revisions/{revision}")
  fun getDefinitionRevision(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("definitionId") definitionId: Int,
    @Path("revision") revision: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
