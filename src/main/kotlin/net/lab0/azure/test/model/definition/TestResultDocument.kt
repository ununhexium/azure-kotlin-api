package net.lab0.azure.test.model.definition

interface TestResultDocument {
  val operationReference: TestOperationReference

  val payload: TestResultPayload
}
