package net.lab0.azure.api.provenance.session

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.provenance.SessionRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SessionApi {
  /**
   * Creates a session, a wrapper around a feed that can store additional metadata on the packages
   * published to it.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param protocol The protocol that the session will target
   */
  @POST("/{organization}/_apis/provenance/session/{protocol}")
  fun createSession(
    @Path("organization") organization: String,
    @Path("protocol") protocol: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SessionRequest
  ): Call<JsonValue>
}
