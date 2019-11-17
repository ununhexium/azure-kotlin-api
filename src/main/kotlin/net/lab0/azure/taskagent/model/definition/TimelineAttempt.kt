package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TimelineAttempt {
  /**
   * Gets or sets the attempt of the record.
   */
  val attempt: Int

  /**
   * Gets or sets the unique identifier for the record.
   */
  val identifier: String

  /**
   * Gets or sets the record identifier located within the specified timeline.
   */
  val recordId: String

  /**
   * Gets or sets the timeline identifier which owns the record representing this attempt.
   */
  val timelineId: String
}
