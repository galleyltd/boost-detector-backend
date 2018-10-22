/**
* OpenDota API
* # Introduction The OpenDota API provides Dota 2 related data including advanced match data extracted from match replays.  **Beginning 2018-04-22, the OpenDota API is limited to 50,000 free calls per month and 60 requests/minute** We offer a Premium Tier with unlimited API calls and higher rate limits. Check out the [API page](https://www.opendota.com/api-keys) to learn more. 
*
* OpenAPI spec version: 17.6.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models


/**
 * 
 * @param account_id account_id
 * @param name name
 * @param country_code country_code
 * @param fantasy_role fantasy_role
 * @param team_id team_id
 * @param team_name team_name
 * @param team_tag team_tag
 * @param is_locked is_locked
 * @param is_pro is_pro
 * @param locked_until locked_until
 * @param steamid steamid
 * @param avatar avatar
 * @param avatarmedium avatarmedium
 * @param avatarfull avatarfull
 * @param profileurl profileurl
 * @param cheese cheese
 * @param fh_unavailable fh_unavailable
 * @param loccountrycode loccountrycode
 * @param last_played last_played
 * @param win win
 * @param games games
 * @param with_win with_win
 * @param with_games with_games
 * @param against_win against_win
 * @param against_games against_games
 * @param with_gpm_sum with_gpm_sum
 * @param with_xpm_sum with_xpm_sum
 */
data class Inline_response_200_7 (
    /* account_id */
    val account_id: kotlin.Int? = null,
    /* name */
    val name: kotlin.String? = null,
    /* country_code */
    val country_code: kotlin.String? = null,
    /* fantasy_role */
    val fantasy_role: kotlin.Int? = null,
    /* team_id */
    val team_id: kotlin.Int? = null,
    /* team_name */
    val team_name: kotlin.String? = null,
    /* team_tag */
    val team_tag: kotlin.String? = null,
    /* is_locked */
    val is_locked: kotlin.Boolean? = null,
    /* is_pro */
    val is_pro: kotlin.Boolean? = null,
    /* locked_until */
    val locked_until: kotlin.Int? = null,
    /* steamid */
    val steamid: kotlin.String? = null,
    /* avatar */
    val avatar: kotlin.String? = null,
    /* avatarmedium */
    val avatarmedium: kotlin.String? = null,
    /* avatarfull */
    val avatarfull: kotlin.String? = null,
    /* profileurl */
    val profileurl: kotlin.String? = null,
    /* cheese */
    val cheese: kotlin.Int? = null,
    /* fh_unavailable */
    val fh_unavailable: kotlin.Boolean? = null,
    /* loccountrycode */
    val loccountrycode: kotlin.String? = null,
    /* last_played */
    val last_played: kotlin.Int? = null,
    /* win */
    val win: kotlin.Int? = null,
    /* games */
    val games: kotlin.Int? = null,
    /* with_win */
    val with_win: kotlin.Int? = null,
    /* with_games */
    val with_games: kotlin.Int? = null,
    /* against_win */
    val against_win: kotlin.Int? = null,
    /* against_games */
    val against_games: kotlin.Int? = null,
    /* with_gpm_sum */
    val with_gpm_sum: kotlin.Int? = null,
    /* with_xpm_sum */
    val with_xpm_sum: kotlin.Int? = null
) {

}
