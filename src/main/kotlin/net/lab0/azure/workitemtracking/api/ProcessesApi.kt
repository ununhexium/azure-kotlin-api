package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.CreateProcessModel
import net.lab0.azure.workitemtracking.model.definition.UpdateProcessModel
import net.lab0.azure.workitemtracking.model.definition.enumeration.GetProcessExpandLevel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ProcessesApi {
  /**
   * Get list of all processes including system and inherited.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/work/processes")
  fun list(
    @Path("organization") organization: String,
    @Query("${'$'}expand") expand: GetProcessExpandLevel,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Creates a process.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/work/processes")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: CreateProcessModel
  ): Call<JsonValue>

  /**
   * Get a single process of a specified ID.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/work/processes/{processTypeId}")
  fun get(
    @Path("organization") organization: String,
    @Path("processTypeId") processTypeId: String,
    @Query("${'$'}expand") expand: GetProcessExpandLevel,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Removes a process of a specific ID.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @DELETE("/{organization}/_apis/work/processes/{processTypeId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("processTypeId") processTypeId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Edit a process of a specific ID.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/work/processes/{processTypeId}")
  fun editProcess(
    @Path("organization") organization: String,
    @Path("processTypeId") processTypeId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: UpdateProcessModel
  ): Call<JsonValue>
}
