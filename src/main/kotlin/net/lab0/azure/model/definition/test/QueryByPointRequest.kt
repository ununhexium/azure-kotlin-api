package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface QueryByPointRequest {
  val projectName: String

  val testPlanId: Int

  val testPointId: Int
}
