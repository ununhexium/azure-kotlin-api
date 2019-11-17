package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String

interface CounterSample {
  val baseValue: Int

  val computedValue: String

  val counterFrequency: Int

  val counterInstanceId: String

  val counterType: String

  val intervalEndDate: String

  val intervalNumber: Int

  val rawValue: Int

  val systemFrequency: Int

  val timeStamp: Int
}
