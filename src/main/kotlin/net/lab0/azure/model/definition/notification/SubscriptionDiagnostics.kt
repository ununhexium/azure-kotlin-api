package net.lab0.azure.model.definition.notification

interface SubscriptionDiagnostics {
  val deliveryResults: SubscriptionTracing

  val deliveryTracing: SubscriptionTracing

  val evaluationTracing: SubscriptionTracing
}
