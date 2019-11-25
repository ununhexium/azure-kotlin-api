package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.cloudloadtest.TestRunRetentionState
import net.lab0.azure.model.definition.enumeration.cloudloadtest.TestRunSubState

interface TestRun : TestRunBasic {
  val abortMessage: TestRunAbortMessage

  val autInitializationError: Boolean

  val chargeable: Boolean

  val chargedVUserminutes: Int

  val description: String

  val executionFinishedDate: String

  val executionStartedDate: String

  val queuedDate: String

  val retentionState: TestRunRetentionState

  val runSourceIdentifier: String

  val runSourceUrl: String

  val startedBy: String

  val startedDate: String

  val stoppedBy: String

  val subState: TestRunSubState

  val supersedeRunSettings: OverridableRunSettings

  val testDrop: TestDropRef

  val testSettings: TestSettings

  val warmUpStartedDate: String

  val webResultUrl: String
}
