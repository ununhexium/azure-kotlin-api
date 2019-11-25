package net.lab0.azure.model.definition.git

import kotlin.String

interface SourceToTargetRef {
  /**
   * The source ref to copy. For example, refs/heads/master.
   */
  val sourceRef: String

  /**
   * The target ref to update. For example, refs/heads/master.
   */
  val targetRef: String
}
