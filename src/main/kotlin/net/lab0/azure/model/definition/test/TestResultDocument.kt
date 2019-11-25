package net.lab0.azure.model.definition.test

interface TestResultDocument {
  val operationReference: TestOperationReference

  val payload: TestResultPayload
}
