package net.lab0.azure.api.tokenadministration.tokenrevocations

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.tokenadministration.TokenAdministrationRevocation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface TokenRevocationsApi {
  /**
   * Revokes the listed OAuth authorizations.
   *
   * @param hostId Host Id to display on the notification page to manage tokens.
   * @param isPublic Set to false for PAT tokens and true for SSH tokens.
   */
  @POST("/_apis/tokenadministration/tokenrevocations")
  fun revokeAuthorizations(
    @Query("hostId") hostId: String,
    @Query("isPublic") isPublic: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TokenAdministrationRevocation
  ): Call<JsonValue>
}
