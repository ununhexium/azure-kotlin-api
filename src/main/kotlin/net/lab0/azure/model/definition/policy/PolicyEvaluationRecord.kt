package net.lab0.azure.model.definition.policy

import kotlin.String
import net.lab0.azure.model.definition.enumeration.policy.PolicyEvaluationStatus

/**
 * This record encapsulates the current state of a policy as it applies to one specific pull
 * request. Each pull request has a unique PolicyEvaluationRecord for each pull request which the
 * policy applies to.
 */
interface PolicyEvaluationRecord {
  val _links: ReferenceLinks

  /**
   * A string which uniquely identifies the target of a policy evaluation.
   */
  val artifactId: String

  /**
   * Time when this policy finished evaluating on this pull request.
   */
  val completedDate: String

  val configuration: PolicyConfiguration

  val context: JObject

  /**
   * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
   */
  val evaluationId: String

  /**
   * Time when this policy was first evaluated on this pull request.
   */
  val startedDate: String

  /**
   * Status of the policy (Running, Approved, Failed, etc.)
   */
  val status: PolicyEvaluationStatus
}
