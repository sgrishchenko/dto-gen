/**
 * Datalore Cell
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package jetbrains.datalore.notebook.common.dataloreModel.models


import com.squareup.moshi.Json

/**
 * 
 *
 * Values: CODE,MD,SQL
 */

enum class CellType(val value: kotlin.String) {

    @Json(name = "CODE")
    CODE("CODE"),

    @Json(name = "MD")
    MD("MD"),

    @Json(name = "SQL")
    SQL("SQL");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CellType) "$data" else null

        /**
         * Returns a valid [CellType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CellType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

