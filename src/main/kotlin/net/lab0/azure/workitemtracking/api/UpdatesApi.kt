package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UpdatesApi {
  /**
   * Returns a the deltas between work item revisions
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/updates")
  fun list(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("${'$'}top") top: Int,
    @Query("${'$'}skip") skip: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Returns a single update for a work item
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/updates/{updateNumber}")
  fun get(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("updateNumber") updateNumber: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
