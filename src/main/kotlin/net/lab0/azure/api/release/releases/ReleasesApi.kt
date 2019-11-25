package net.lab0.azure.api.release.releases

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.ReleaseExpands
import net.lab0.azure.model.definition.enumeration.release.ReleaseQueryOrder
import net.lab0.azure.model.definition.enumeration.release.ReleaseStatus
import net.lab0.azure.model.definition.release.Release
import net.lab0.azure.model.definition.release.ReleaseStartMetadata
import net.lab0.azure.model.definition.release.ReleaseUpdateMetadata
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ReleasesApi {
  /**
   * Get a list of releases
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param definitionId Releases from this release definition Id.
   * @param searchText Releases with names containing searchText.
   * @param createdBy Releases created by this user.
   * @param statusFilter Releases that have this status.
   * @param minCreatedTime Releases that were created after this time.
   * @param maxCreatedTime Releases that were created before this time.
   * @param queryOrder Gets the results in the defined order of created date for releases. Default
   * is descending.
   * @param top Number of releases to get. Default is 50.
   * @param continuationToken Gets the releases after the continuation token provided.
   * @param expand The property that should be expanded in the list of releases.
   * @param artifactTypeId Releases with given artifactTypeId will be returned. Values can be Build,
   * Jenkins, GitHub, Nuget, Team Build (external), ExternalTFSBuild, Git, TFVC, ExternalTfsXamlBuild.
   * @param sourceId Unique identifier of the artifact used. e.g. For build it would be
   * {projectGuid}:{BuildDefinitionId}, for Jenkins it would be
   * {JenkinsConnectionId}:{JenkinsDefinitionId}, for TfsOnPrem it would be
   * {TfsOnPremConnectionId}:{ProjectName}:{TfsOnPremDefinitionId}. For third-party artifacts e.g.
   * TeamCity, BitBucket you may refer 'uniqueSourceIdentifier' inside vss-extension.json
   * https://github.com/Microsoft/vsts-rm-extensions/blob/master/Extensions.
   * @param artifactVersionId Releases with given artifactVersionId will be returned. E.g. in case
   * of Build artifactType, it is buildId.
   * @param sourceBranchFilter Releases with given sourceBranchFilter will be returned.
   * @param isDeleted Gets the soft deleted releases, if true.
   * @param tagFilter A comma-delimited list of tags. Only releases with these tags will be
   * returned.
   * @param propertyFilters A comma-delimited list of extended properties to be retrieved. If set,
   * the returned Releases will contain values for the specified property Ids (if they exist). If not
   * set, properties will not be included. Note that this will not filter out any Release from results
   * irrespective of whether it has property set or not.
   * @param releaseIdFilter A comma-delimited list of releases Ids. Only releases with these Ids
   * will be returned.
   */
  @GET("/{organization}/{project}/_apis/release/releases")
  fun getReleases(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("definitionId") definitionId: Int? = null,
    @Query("definitionEnvironmentId") definitionEnvironmentId: Int? = null,
    @Query("searchText") searchText: String? = null,
    @Query("createdBy") createdBy: String? = null,
    @Query("statusFilter") statusFilter: ReleaseStatus? = null,
    @Query("environmentStatusFilter") environmentStatusFilter: Int? = null,
    @Query("minCreatedTime") minCreatedTime: String? = null,
    @Query("maxCreatedTime") maxCreatedTime: String? = null,
    @Query("queryOrder") queryOrder: ReleaseQueryOrder? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("continuationToken") continuationToken: Int? = null,
    @Query("${'$'}expand") expand: ReleaseExpands? = null,
    @Query("artifactTypeId") artifactTypeId: String? = null,
    @Query("sourceId") sourceId: String? = null,
    @Query("artifactVersionId") artifactVersionId: String? = null,
    @Query("sourceBranchFilter") sourceBranchFilter: String? = null,
    @Query("isDeleted") isDeleted: Boolean? = null,
    @Query("tagFilter") tagFilter: String? = null,
    @Query("propertyFilters") propertyFilters: String? = null,
    @Query("releaseIdFilter") releaseIdFilter: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a release.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/release/releases")
  fun createRelease(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ReleaseStartMetadata
  ): Call<JsonValue>

  /**
   * Get release for a given revision number.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   * @param definitionSnapshotRevision Definition snapshot revision number.
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}")
  fun getReleaseRevision(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Query("definitionSnapshotRevision") definitionSnapshotRevision: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a complete release object.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release to update.
   */
  @PUT("/{organization}/{project}/_apis/release/releases/{releaseId}")
  fun updateRelease(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Release
  ): Call<JsonValue>

  /**
   * Update few properties of a release.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release to update.
   */
  @PATCH("/{organization}/{project}/_apis/release/releases/{releaseId}")
  fun updateReleaseResource(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ReleaseUpdateMetadata
  ): Call<JsonValue>
}
