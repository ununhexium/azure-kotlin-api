package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.ProcessBehaviorCreateRequest
import net.lab0.azure.workitemtracking.model.definition.ProcessBehaviorUpdateRequest
import net.lab0.azure.workitemtracking.model.definition.enumeration.GetBehaviorsExpand
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface BehaviorsApi {
  /**
   * Returns a list of all behaviors in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   */
  @GET("/{organization}/_apis/work/processes/{processId}/behaviors")
  fun list(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("${'$'}expand") expand: GetBehaviorsExpand,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Creates a single behavior in the given process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   */
  @POST("/{organization}/_apis/work/processes/{processId}/behaviors")
  fun create(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: ProcessBehaviorCreateRequest
  ): Call<JsonValue>

  /**
   * Returns a behavior of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param behaviorRefName The reference name of the behavior
   */
  @GET("/{organization}/_apis/work/processes/{processId}/behaviors/{behaviorRefName}")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("behaviorRefName") behaviorRefName: String,
    @Query("${'$'}expand") expand: GetBehaviorsExpand,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Replaces a behavior in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param behaviorRefName The reference name of the behavior
   */
  @PUT("/{organization}/_apis/work/processes/{processId}/behaviors/{behaviorRefName}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("behaviorRefName") behaviorRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: ProcessBehaviorUpdateRequest
  ): Call<JsonValue>

  /**
   * Removes a behavior in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param behaviorRefName The reference name of the behavior
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/behaviors/{behaviorRefName}")
  fun delete(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("behaviorRefName") behaviorRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
