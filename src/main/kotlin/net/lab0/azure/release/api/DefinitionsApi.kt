package net.lab0.azure.release.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.ReleaseDefinition
import net.lab0.azure.release.model.definition.enumeration.ReleaseDefinitionExpands
import net.lab0.azure.release.model.definition.enumeration.ReleaseDefinitionQueryOrder
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface DefinitionsApi {
  /**
   * Get a list of release definitions.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param searchText Get release definitions with names containing searchText.
   * @param expand The properties that should be expanded in the list of Release definitions.
   * @param artifactType Release definitions with given artifactType will be returned. Values can be
   * Build, Jenkins, GitHub, Nuget, Team Build (external), ExternalTFSBuild, Git, TFVC,
   * ExternalTfsXamlBuild.
   * @param artifactSourceId Release definitions with given artifactSourceId will be returned. e.g.
   * For build it would be {projectGuid}:{BuildDefinitionId}, for Jenkins it would be
   * {JenkinsConnectionId}:{JenkinsDefinitionId}, for TfsOnPrem it would be
   * {TfsOnPremConnectionId}:{ProjectName}:{TfsOnPremDefinitionId}. For third-party artifacts e.g.
   * TeamCity, BitBucket you may refer 'uniqueSourceIdentifier' inside vss-extension.json at
   * https://github.com/Microsoft/vsts-rm-extensions/blob/master/Extensions.
   * @param top Number of release definitions to get.
   * @param continuationToken Gets the release definitions after the continuation token provided.
   * @param queryOrder Gets the results in the defined order. Default is 'IdAscending'.
   * @param path Gets the release definitions under the specified path.
   * @param isExactNameMatch 'true'to gets the release definitions with exact match as specified in
   * searchText. Default is 'false'.
   * @param tagFilter A comma-delimited list of tags. Only release definitions with these tags will
   * be returned.
   * @param propertyFilters A comma-delimited list of extended properties to be retrieved. If set,
   * the returned Release Definitions will contain values for the specified property Ids (if they
   * exist). If not set, properties will not be included. Note that this will not filter out any
   * Release Definition from results irrespective of whether it has property set or not.
   * @param definitionIdFilter A comma-delimited list of release definitions to retrieve.
   * @param isDeleted 'true' to get release definitions that has been deleted. Default is 'false'
   */
  @GET("/{organization}/{project}/_apis/release/definitions")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("searchText") searchText: String,
    @Query("${'$'}expand") expand: ReleaseDefinitionExpands,
    @Query("artifactType") artifactType: String,
    @Query("artifactSourceId") artifactSourceId: String,
    @Query("${'$'}top") top: Int,
    @Query("continuationToken") continuationToken: String,
    @Query("queryOrder") queryOrder: ReleaseDefinitionQueryOrder,
    @Query("path") path: String,
    @Query("isExactNameMatch") isExactNameMatch: Boolean,
    @Query("tagFilter") tagFilter: String,
    @Query("propertyFilters") propertyFilters: String,
    @Query("definitionIdFilter") definitionIdFilter: String,
    @Query("isDeleted") isDeleted: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a release definition.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @PUT("/{organization}/{project}/_apis/release/definitions")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: ReleaseDefinition
  ): Call<JsonValue>

  /**
   * Create a release definition
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/release/definitions")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: ReleaseDefinition
  ): Call<JsonValue>

  /**
   * Get a release definition.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param definitionId Id of the release definition.
   * @param propertyFilters A comma-delimited list of extended properties to be retrieved. If set,
   * the returned Release Definition will contain values for the specified property Ids (if they
   * exist). If not set, properties will not be included.
   */
  @GET("/{organization}/{project}/_apis/release/definitions/{definitionId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("definitionId") definitionId: Int,
    @Query("propertyFilters") propertyFilters: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a release definition.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param definitionId Id of the release definition.
   * @param comment Comment for deleting a release definition.
   * @param forceDelete 'true' to automatically cancel any in-progress release deployments and
   * proceed with release definition deletion . Default is 'false'.
   */
  @DELETE("/{organization}/{project}/_apis/release/definitions/{definitionId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("definitionId") definitionId: Int,
    @Query("comment") comment: String,
    @Query("forceDelete") forceDelete: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
