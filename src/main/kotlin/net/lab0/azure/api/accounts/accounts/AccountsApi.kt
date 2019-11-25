package net.lab0.azure.api.accounts.accounts

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
  fun getAccounts(
    @Query("ownerId") ownerId: String? = null,
    @Query("memberId") memberId: String? = null,
    @Query("properties") properties: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
