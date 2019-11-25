package net.lab0.azure.model.definition.servicehooks

interface UpdateSubscripitonDiagnosticsParameters {
  val deliveryResults: UpdateSubscripitonTracingParameters

  val deliveryTracing: UpdateSubscripitonTracingParameters

  val evaluationTracing: UpdateSubscripitonTracingParameters
}
