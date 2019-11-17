package net.lab0.azure.accounts.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AccountsApi {
  /**
   * Get a list of accounts for a specific owner or a specific member.
   *
   * @param ownerId ID for the owner of the accounts.
   * @param memberId ID for a member of the accounts.
   */
  @GET("/_apis/accounts")
  fun list(
    @Query("ownerId") ownerId: String,
    @Query("memberId") memberId: String,
    @Query("properties") properties: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
