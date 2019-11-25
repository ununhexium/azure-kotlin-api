package net.lab0.azure.api.workitemtracking.workitemrelationtypes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemRelationTypesApi {
  /**
   * Gets the work item relation types.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/wit/workitemrelationtypes")
  fun getRelationTypes(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0"): Call<JsonValue>

  /**
   * Gets the work item relation type definition.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param relation The relation name
   */
  @GET("/{organization}/_apis/wit/workitemrelationtypes/{relation}")
  fun getRelationType(
    @Path("organization") organization: String,
    @Path("relation") relation: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
