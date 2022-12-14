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

import jetbrains.datalore.notebook.common.dataloreModel.models.CellType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param type 
 * @param text 
 * @param hiddenInput 
 * @param hiddenOutput 
 */

data class Cell (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "type")
    val type: CellType,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "hiddenInput")
    val hiddenInput: kotlin.Boolean = false,

    @Json(name = "hiddenOutput")
    val hiddenOutput: kotlin.Boolean = false

)

