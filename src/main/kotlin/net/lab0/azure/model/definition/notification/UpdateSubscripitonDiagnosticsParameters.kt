package net.lab0.azure.model.definition.notification

interface UpdateSubscripitonDiagnosticsParameters {
  val deliveryResults: UpdateSubscripitonTracingParameters

  val deliveryTracing: UpdateSubscripitonTracingParameters

  val evaluationTracing: UpdateSubscripitonTracingParameters
}
