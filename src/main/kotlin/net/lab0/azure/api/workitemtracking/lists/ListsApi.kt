package net.lab0.azure.api.workitemtracking.lists

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.PickList
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ListsApi {
  /**
   * Returns meta data of the picklist.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/work/processes/lists")
  fun getListsMetadata(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * Creates a picklist.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/work/processes/lists")
  fun createList(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PickList
  ): Call<JsonValue>

  /**
   * Returns a picklist.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param listId The ID of the list
   */
  @GET("/{organization}/_apis/work/processes/lists/{listId}")
  fun getList(
    @Path("organization") organization: String,
    @Path("listId") listId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Updates a list.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param listId The ID of the list
   */
  @PUT("/{organization}/_apis/work/processes/lists/{listId}")
  fun updateList(
    @Path("organization") organization: String,
    @Path("listId") listId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PickList
  ): Call<JsonValue>

  /**
   * Removes a picklist.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param listId The ID of the list
   */
  @DELETE("/{organization}/_apis/work/processes/lists/{listId}")
  fun deleteList(
    @Path("organization") organization: String,
    @Path("listId") listId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
