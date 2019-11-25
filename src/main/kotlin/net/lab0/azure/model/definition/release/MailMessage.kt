package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.SenderType

interface MailMessage {
  val body: String

  val cC: EmailRecipients

  val inReplyTo: String

  val messageId: String

  val replyBy: String

  val replyTo: EmailRecipients

  val sections: List<JsonObject>

  val senderType: SenderType

  val subject: String

  val to: EmailRecipients
}
