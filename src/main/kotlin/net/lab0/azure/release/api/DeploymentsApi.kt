package net.lab0.azure.release.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.DeploymentOperationStatus
import net.lab0.azure.release.model.definition.enumeration.DeploymentStatus
import net.lab0.azure.release.model.definition.enumeration.ReleaseQueryOrder
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
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("definitionId") definitionId: Int,
    @Query("definitionEnvironmentId") definitionEnvironmentId: Int,
    @Query("createdBy") createdBy: String,
    @Query("minModifiedTime") minModifiedTime: String,
    @Query("maxModifiedTime") maxModifiedTime: String,
    @Query("deploymentStatus") deploymentStatus: DeploymentStatus,
    @Query("operationStatus") operationStatus: DeploymentOperationStatus,
    @Query("latestAttemptsOnly") latestAttemptsOnly: Boolean,
    @Query("queryOrder") queryOrder: ReleaseQueryOrder,
    @Query("${'$'}top") top: Int,
    @Query("continuationToken") continuationToken: Int,
    @Query("createdFor") createdFor: String,
    @Query("minStartedTime") minStartedTime: String,
    @Query("maxStartedTime") maxStartedTime: String,
    @Query("sourceBranch") sourceBranch: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
