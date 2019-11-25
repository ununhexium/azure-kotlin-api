package net.lab0.azure.api.policy.evaluations

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface EvaluationsApi {
  /**
   * Retrieves a list of all the policy evaluation statuses for a specific pull request.
   *
   * Evaluations are retrieved using an artifact ID which uniquely identifies the pull request.
   * To generate an artifact ID for a pull request, use this template:
   * ```
   * vstfs:///CodeReview/CodeReviewId/{projectId}/{pullRequestId}
   * ```
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param artifactId A string which uniquely identifies the target of a policy evaluation.
   * @param includeNotApplicable Some policies might determine that they do not apply to a specific
   * pull request. Setting this parameter to true will return evaluation records even for policies
   * which don't apply to this pull request.
   * @param top The number of policy evaluation records to retrieve.
   * @param skip The number of policy evaluation records to ignore. For example, to retrieve results
   * 101-150, set top to 50 and skip to 100.
   */
  @GET("/{organization}/{project}/_apis/policy/evaluations")
  fun getPolicyEvaluations(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("artifactId") artifactId: String,
    @Query("includeNotApplicable") includeNotApplicable: Boolean? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Gets the present evaluation state of a policy.
   *
   * Each policy which applies to a pull request will have an evaluation state which is specific to
   * that policy running
   * in the context of that pull request. Each evaluation is uniquely identified via a Guid. You can
   * find all the policy
   * evaluations for a specific pull request using the List operation of this controller.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param evaluationId ID of the policy evaluation to be retrieved.
   */
  @GET("/{organization}/{project}/_apis/policy/evaluations/{evaluationId}")
  fun getPolicyEvaluation(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("evaluationId") evaluationId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Requeue the policy evaluation.
   *
   * Some policies define a "requeue" action which performs some policy-specific operation.
   * You can trigger this operation by updating an existing policy evaluation and setting the
   * PolicyEvaluationRecord.Status field to Queued.
   * Although any policy evaluation can be requeued, at present only build policies perform any
   * action
   * in response. Requeueing a build policy will queue a new build to run (cancelling any existing
   * build which
   * is running).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param evaluationId ID of the policy evaluation to be retrieved.
   */
  @PATCH("/{organization}/{project}/_apis/policy/evaluations/{evaluationId}")
  fun requeuePolicyEvaluation(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("evaluationId") evaluationId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
