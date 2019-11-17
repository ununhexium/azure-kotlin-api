package net.lab0.azure.tokenadministration.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.tokenadministration.model.definition.TokenAdministrationRevocation
import retrofit2.Call
import retrofit2.http.Body
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
    @Query("isPublic") isPublic: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TokenAdministrationRevocation
  ): Call<JsonValue>
}
