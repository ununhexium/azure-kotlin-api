package net.lab0.azure.notification.model.definition

interface SubscriptionDiagnostics {
  val deliveryResults: SubscriptionTracing

  val deliveryTracing: SubscriptionTracing

  val evaluationTracing: SubscriptionTracing
}
