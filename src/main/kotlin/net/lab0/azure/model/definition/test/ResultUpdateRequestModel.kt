package net.lab0.azure.model.definition.test

import kotlin.collections.List

interface ResultUpdateRequestModel {
  val actionResultDeletes: List<TestActionResultModel>

  val actionResults: List<TestActionResultModel>

  val parameterDeletes: List<TestResultParameterModel>

  val parameters: List<TestResultParameterModel>

  val testCaseResult: TestCaseResultUpdateModel
}
