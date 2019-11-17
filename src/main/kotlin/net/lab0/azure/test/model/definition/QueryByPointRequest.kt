package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface QueryByPointRequest {
  val projectName: String

  val testPlanId: Int

  val testPointId: Int
}
