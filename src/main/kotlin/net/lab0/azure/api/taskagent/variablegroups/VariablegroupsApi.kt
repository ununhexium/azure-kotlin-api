package net.lab0.azure.api.taskagent.variablegroups

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.taskagent.VariableGroupParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface VariablegroupsApi {
  /**
   * Get variable groups by ids.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param groupIds Comma separated list of Ids of variable groups.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/variablegroups")
  fun getVariableGroupsById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("groupIds") groupIds: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Add a variable group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/distributedtask/variablegroups")
  fun addVariableGroup(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: VariableGroupParameters
  ): Call<JsonValue>

  /**
   * Get a variable group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param groupId Id of the variable group.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/variablegroups/{groupId}")
  fun getVariableGroup(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("groupId") groupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a variable group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param groupId Id of the variable group to update.
   */
  @PUT("/{organization}/{project}/_apis/distributedtask/variablegroups/{groupId}")
  fun updateVariableGroup(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("groupId") groupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: VariableGroupParameters
  ): Call<JsonValue>

  /**
   * Delete a variable group
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param groupId Id of the variable group.
   */
  @DELETE("/{organization}/{project}/_apis/distributedtask/variablegroups/{groupId}")
  fun deleteVariableGroup(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("groupId") groupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
