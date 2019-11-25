package net.lab0.azure.api.git.pullrequests

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.PullRequestStatus
import net.lab0.azure.model.definition.git.GitPullRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestsApi {
  /**
   * Retrieve all pull requests matching a specified criteria.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param searchCriteria_includeLinks Whether to include the _links field on the shallow
   * references
   * @param searchCriteria_sourceRefName If set, search for pull requests from this branch.
   * @param searchCriteria_sourceRepositoryId If set, search for pull requests whose source branch
   * is in this repository.
   * @param searchCriteria_targetRefName If set, search for pull requests into this branch.
   * @param searchCriteria_status If set, search for pull requests that are in this state. Defaults
   * to Active if unset.
   * @param searchCriteria_reviewerId If set, search for pull requests that have this identity as a
   * reviewer.
   * @param searchCriteria_creatorId If set, search for pull requests that were created by this
   * identity.
   * @param searchCriteria_repositoryId If set, search for pull requests whose target branch is in
   * this repository.
   * @param maxCommentLength Not used.
   * @param skip The number of pull requests to ignore. For example, to retrieve results 101-150,
   * set top to 50 and skip to 100.
   * @param top The number of pull requests to retrieve.
   */
  @GET("/{organization}/{project}/_apis/git/pullrequests")
  fun getPullRequestsByProject(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("searchCriteria.includeLinks") searchCriteria_includeLinks: Boolean? = null,
    @Query("searchCriteria.sourceRefName") searchCriteria_sourceRefName: String? = null,
    @Query("searchCriteria.sourceRepositoryId") searchCriteria_sourceRepositoryId: String? = null,
    @Query("searchCriteria.targetRefName") searchCriteria_targetRefName: String? = null,
    @Query("searchCriteria.status") searchCriteria_status: PullRequestStatus? = null,
    @Query("searchCriteria.reviewerId") searchCriteria_reviewerId: String? = null,
    @Query("searchCriteria.creatorId") searchCriteria_creatorId: String? = null,
    @Query("searchCriteria.repositoryId") searchCriteria_repositoryId: String? = null,
    @Query("maxCommentLength") maxCommentLength: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieve a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param pullRequestId The ID of the pull request to retrieve.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/pullrequests/{pullRequestId}")
  fun getPullRequestById(
    @Path("organization") organization: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieve all pull requests matching a specified criteria.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param project Project ID or project name
   * @param searchCriteria_includeLinks Whether to include the _links field on the shallow
   * references
   * @param searchCriteria_sourceRefName If set, search for pull requests from this branch.
   * @param searchCriteria_sourceRepositoryId If set, search for pull requests whose source branch
   * is in this repository.
   * @param searchCriteria_targetRefName If set, search for pull requests into this branch.
   * @param searchCriteria_status If set, search for pull requests that are in this state. Defaults
   * to Active if unset.
   * @param searchCriteria_reviewerId If set, search for pull requests that have this identity as a
   * reviewer.
   * @param searchCriteria_creatorId If set, search for pull requests that were created by this
   * identity.
   * @param searchCriteria_repositoryId If set, search for pull requests whose target branch is in
   * this repository.
   * @param maxCommentLength Not used.
   * @param skip The number of pull requests to ignore. For example, to retrieve results 101-150,
   * set top to 50 and skip to 100.
   * @param top The number of pull requests to retrieve.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests")
  fun getPullRequests(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("searchCriteria.includeLinks") searchCriteria_includeLinks: Boolean? = null,
    @Query("searchCriteria.sourceRefName") searchCriteria_sourceRefName: String? = null,
    @Query("searchCriteria.sourceRepositoryId") searchCriteria_sourceRepositoryId: String? = null,
    @Query("searchCriteria.targetRefName") searchCriteria_targetRefName: String? = null,
    @Query("searchCriteria.status") searchCriteria_status: PullRequestStatus? = null,
    @Query("searchCriteria.reviewerId") searchCriteria_reviewerId: String? = null,
    @Query("searchCriteria.creatorId") searchCriteria_creatorId: String? = null,
    @Query("searchCriteria.repositoryId") searchCriteria_repositoryId: String? = null,
    @Query("maxCommentLength") maxCommentLength: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param project Project ID or project name
   * @param supportsIterations If true, subsequent pushes to the pull request will be individually
   * reviewable. Set this to false for large pull requests for performance reasons if this
   * functionality is not needed.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests")
  fun createPullRequest(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("supportsIterations") supportsIterations: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitPullRequest
  ): Call<JsonValue>

  /**
   * Retrieve a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId The ID of the pull request to retrieve.
   * @param project Project ID or project name
   * @param maxCommentLength Not used.
   * @param skip Not used.
   * @param top Not used.
   * @param includeCommits If true, the pull request will be returned with the associated commits.
   * @param includeWorkItemRefs If true, the pull request will be returned with the associated work
   * item references.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests/{pullRequestId}")
  fun getPullRequest(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("maxCommentLength") maxCommentLength: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("includeCommits") includeCommits: Boolean? = null,
    @Query("includeWorkItemRefs") includeWorkItemRefs: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a pull request.
   *
   * These are the properties that can be updated with the API:
   *  - Status
   *  - Title
   *  - Description
   *  - CompletionOptions
   *  - MergeOptions
   *  - AutoCompleteSetBy.Id
   *  - TargetRefName (when the PR retargeting feature is enabled)
   *  Attempting to update other properties outside of this list will either cause the server to
   * throw an `InvalidArgumentValueException`,
   *  or to silently ignore the update.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId The ID of the pull request to retrieve.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests/{pullRequestId}")
  fun updatePullRequest(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitPullRequest
  ): Call<JsonValue>
}
