package net.lab0.azure.notification.model.definition

interface UpdateSubscripitonDiagnosticsParameters {
  val deliveryResults: UpdateSubscripitonTracingParameters

  val deliveryTracing: UpdateSubscripitonTracingParameters

  val evaluationTracing: UpdateSubscripitonTracingParameters
}
