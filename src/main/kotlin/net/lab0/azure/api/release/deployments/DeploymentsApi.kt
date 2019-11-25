package net.lab0.azure.api.release.deployments

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.DeploymentOperationStatus
import net.lab0.azure.model.definition.enumeration.release.DeploymentStatus
import net.lab0.azure.model.definition.enumeration.release.ReleaseQueryOrder
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DeploymentsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/release/deployments")
  fun getDeployments(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("definitionId") definitionId: Int? = null,
    @Query("definitionEnvironmentId") definitionEnvironmentId: Int? = null,
    @Query("createdBy") createdBy: String? = null,
    @Query("minModifiedTime") minModifiedTime: String? = null,
    @Query("maxModifiedTime") maxModifiedTime: String? = null,
    @Query("deploymentStatus") deploymentStatus: DeploymentStatus? = null,
    @Query("operationStatus") operationStatus: DeploymentOperationStatus? = null,
    @Query("latestAttemptsOnly") latestAttemptsOnly: Boolean? = null,
    @Query("queryOrder") queryOrder: ReleaseQueryOrder? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("continuationToken") continuationToken: Int? = null,
    @Query("createdFor") createdFor: String? = null,
    @Query("minStartedTime") minStartedTime: String? = null,
    @Query("maxStartedTime") maxStartedTime: String? = null,
    @Query("sourceBranch") sourceBranch: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
