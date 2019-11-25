package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

/**
 * Test point query class.
 */
interface TestPointsQuery {
  /**
   * Order by results.
   */
  val orderBy: String

  /**
   * List of test points
   */
  val points: List<TestPoint>

  val pointsFilter: PointsFilter

  /**
   * List of workitem fields to get.
   */
  val witFields: List<String>
}
