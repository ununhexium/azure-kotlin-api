package net.lab0.azure.tokenadministration.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.tokenadministration.model.definition.TokenAdminRevocation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface TokenListGlobalIdentitiesApi {
  /**
   * Revokes the listed OAuth authorizations.
   *
   * @param isPublic Set to false for PAT tokens and true for SSH tokens.
   */
  @POST("/_apis/tokenadministration/tokenlistglobalidentities")
  fun list(
    @Query("isPublic") isPublic: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: List<TokenAdminRevocation>
  ): Call<JsonValue>
}