package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets operation status of deployment.
 */
enum class DeploymentOperationStatus {
  /**
   * The deployment operation status is undefined.
   */
  @Json(name = "undefined")
  UNDEFINED,

  /**
   * The deployment operation status is queued.
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * The deployment operation status is scheduled.
   */
  @Json(name = "scheduled")
  SCHEDULED,

  /**
   * The deployment operation status is pending.
   */
  @Json(name = "pending")
  PENDING,

  /**
   * The deployment operation status is approved.
   */
  @Json(name = "approved")
  APPROVED,

  /**
   * The deployment operation status is rejected.
   */
  @Json(name = "rejected")
  REJECTED,

  /**
   * The deployment operation status is deferred.
   */
  @Json(name = "deferred")
  DEFERRED,

  /**
   * The deployment operation status is queued for agent.
   */
  @Json(name = "queuedForAgent")
  QUEUED_FOR_AGENT,

  /**
   * The deployment operation status is phase inprogress.
   */
  @Json(name = "phaseInProgress")
  PHASE_IN_PROGRESS,

  /**
   * The deployment operation status is phase succeeded.
   */
  @Json(name = "phaseSucceeded")
  PHASE_SUCCEEDED,

  /**
   * The deployment operation status is phase partially succeeded.
   */
  @Json(name = "phasePartiallySucceeded")
  PHASE_PARTIALLY_SUCCEEDED,

  /**
   * The deployment operation status is phase failed.
   */
  @Json(name = "phaseFailed")
  PHASE_FAILED,

  /**
   * The deployment operation status is canceled.
   */
  @Json(name = "canceled")
  CANCELED,

  /**
   * The deployment operation status is phase canceled.
   */
  @Json(name = "phaseCanceled")
  PHASE_CANCELED,

  /**
   * The deployment operation status is manualintervention pending.
   */
  @Json(name = "manualInterventionPending")
  MANUAL_INTERVENTION_PENDING,

  /**
   * The deployment operation status is queued for pipeline.
   */
  @Json(name = "queuedForPipeline")
  QUEUED_FOR_PIPELINE,

  /**
   * The deployment operation status is cancelling.
   */
  @Json(name = "cancelling")
  CANCELLING,

  /**
   * The deployment operation status is EvaluatingGates.
   */
  @Json(name = "evaluatingGates")
  EVALUATING_GATES,

  /**
   * The deployment operation status is GateFailed.
   */
  @Json(name = "gateFailed")
  GATE_FAILED,

  /**
   * The deployment operation status is all.
   */
  @Json(name = "all")
  ALL
}
