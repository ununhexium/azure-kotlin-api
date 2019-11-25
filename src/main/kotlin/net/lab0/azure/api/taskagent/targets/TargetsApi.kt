package net.lab0.azure.api.taskagent.targets

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.taskagent.DeploymentTargetExpands
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentJobResultFilter
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentStatusFilter
import net.lab0.azure.model.definition.taskagent.DeploymentTargetUpdateParameter
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface TargetsApi {
  /**
   * Get a list of deployment targets in a deployment group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group.
   * @param tags Get only the deployment targets that contain all these comma separted list of tags.
   * @param name Name pattern of the deployment targets to return.
   * @param partialNameMatch When set to true, treats **name** as pattern. Else treats it as
   * absolute match. Default is **false**.
   * @param expand Include these additional details in the returned objects.
   * @param agentStatus Get only deployment targets that have this status.
   * @param agentJobResult Get only deployment targets that have this last job result.
   * @param continuationToken Get deployment targets with names greater than this continuationToken
   * lexicographically.
   * @param top Maximum number of deployment targets to return. Default is **1000**.
   * @param enabled Get only deployment targets that are enabled or disabled. Default is 'null'
   * which returns all the targets.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}/targets")
  fun getDeploymentTargets(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Query("tags") tags: String? = null,
    @Query("name") name: String? = null,
    @Query("partialNameMatch") partialNameMatch: Boolean? = null,
    @Query("${'$'}expand") expand: DeploymentTargetExpands? = null,
    @Query("agentStatus") agentStatus: TaskAgentStatusFilter? = null,
    @Query("agentJobResult") agentJobResult: TaskAgentJobResultFilter? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("enabled") enabled: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update tags of a list of deployment targets in a deployment group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group in which deployment targets are updated.
   */
  @PATCH("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}/targets")
  fun updateDeploymentTargets(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<DeploymentTargetUpdateParameter>
  ): Call<JsonValue>

  /**
   * Get a deployment target by its ID in a deployment group
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group to which deployment target belongs.
   * @param targetId ID of the deployment target to return.
   * @param expand Include these additional details in the returned objects.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}/targets/{targetId}")
  fun getDeploymentTarget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Path("targetId") targetId: Int,
    @Query("${'$'}expand") expand: DeploymentTargetExpands? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a deployment target in a deployment group. This deletes the agent from associated
   * deployment pool too.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param deploymentGroupId ID of the deployment group in which deployment target is deleted.
   * @param targetId ID of the deployment target to delete.
   */
  @DELETE("/{organization}/{project}/_apis/distributedtask/deploymentgroups/{deploymentGroupId}/targets/{targetId}")
  fun deleteDeploymentTarget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("deploymentGroupId") deploymentGroupId: Int,
    @Path("targetId") targetId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
