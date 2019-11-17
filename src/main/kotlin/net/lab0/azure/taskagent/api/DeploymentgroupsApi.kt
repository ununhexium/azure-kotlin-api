package net.lab0.azure.taskagent.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.DeploymentGroupCreateParameter
import net.lab0.azure.taskagent.model.definition.DeploymentGroupUpdateParameter
import net.lab0.azure.taskagent.model.definition.enumeration.DeploymentGroupActionFilter
import net.lab0.azure.taskagent.model.definition.enumeration.DeploymentGroupExpands
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface DeploymentgroupsApi {
  /**
   * Get a list of deployment groups by name or IDs.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param name Name of the deployment group.
   * @param actionFilter Get only deployment groups on which this action can be performed.
   * @param expand Include these additional details in the returned objects.
   * @param continuationToken Get deployment groups with names greater than this continuationToken
   * lexicographically.
   * @param top Maximum number of deployment groups to return. Default is **1000**.
   * @param ids Comma separated list of IDs of the deployment groups.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/deploymentgroups")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("name") name: String,
    @Query("actionFilter") actionFilter: DeploymentGroupActionFilter,
    @Query("${'$'}expand") expand: DeploymentGroupExpands,
    @Query("continuationToken") continuationToken: String,
    @Query("${'$'}top") top: Int,
    @Query("ids") ids: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a deployment group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/distributedtask/deploymentgroups")
  fun add(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: DeploymentGroupCreateParameter
  ): Call<JsonValue>

  /**
   * Get a deployment group by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group.
   * @param actionFilter Get the deployment group only if this action can be performed on it.
   * @param expand Include these additional details in the returned object.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Query("actionFilter") actionFilter: DeploymentGroupActionFilter,
    @Query("${'$'}expand") expand: DeploymentGroupExpands,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a deployment group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group to be deleted.
   */
  @DELETE("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a deployment group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group.
   */
  @PATCH("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: DeploymentGroupUpdateParameter
  ): Call<JsonValue>
}
