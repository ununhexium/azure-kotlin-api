package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface TestSessionExploredWorkItemReference : TestSessionWorkItemReference {
  /**
   * Workitem references of workitems filed as a part of the current workitem exploration.
   */
  val associatedWorkItems: List<TestSessionWorkItemReference>

  /**
   * Time when exploration of workitem ended.
   */
  val endTime: String

  /**
   * Time when explore of workitem was started.
   */
  val startTime: String
}
