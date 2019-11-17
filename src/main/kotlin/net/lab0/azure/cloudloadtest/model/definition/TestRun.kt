package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.enumeration.TestRunRetentionState
import net.lab0.azure.cloudloadtest.model.definition.enumeration.TestRunSubState

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
