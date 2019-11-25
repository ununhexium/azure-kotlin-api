package net.lab0.azure.api.release.manualinterventions

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.release.ManualInterventionUpdateMetadata
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface ManualInterventionsApi {
  /**
   * List all manual interventions for a given release.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   */
  @GET("/{organization}/{project}/_apis/Release/releases/{releaseId}/manualinterventions")
  fun getManualInterventions(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get manual intervention for a given release and manual intervention id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   * @param manualInterventionId Id of the manual intervention.
   */
  @GET("/{organization}/{project}/_apis/Release/releases/{releaseId}/manualinterventions/{manualInterventionId}")
  fun getManualIntervention(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("manualInterventionId") manualInterventionId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update manual intervention.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   * @param manualInterventionId Id of the manual intervention.
   */
  @PATCH("/{organization}/{project}/_apis/Release/releases/{releaseId}/manualinterventions/{manualInterventionId}")
  fun updateManualIntervention(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("manualInterventionId") manualInterventionId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ManualInterventionUpdateMetadata
  ): Call<JsonValue>
}
