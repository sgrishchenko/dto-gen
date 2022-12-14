/* tslint:disable */
/* eslint-disable */
/**
 * Datalore Cell
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { CellType } from './CellType';
import {
    CellTypeFromJSON,
    CellTypeFromJSONTyped,
    CellTypeToJSON,
} from './CellType';

/**
 * 
 * @export
 * @interface Cell
 */
export interface Cell {
    /**
     * 
     * @type {string}
     * @memberof Cell
     */
    id: string;
    /**
     * 
     * @type {CellType}
     * @memberof Cell
     */
    type: CellType;
    /**
     * 
     * @type {string}
     * @memberof Cell
     */
    text: string;
    /**
     * 
     * @type {boolean}
     * @memberof Cell
     */
    hiddenInput: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof Cell
     */
    hiddenOutput: boolean;
}

/**
 * Check if a given object implements the Cell interface.
 */
export function instanceOfCell(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;
    isInstance = isInstance && "type" in value;
    isInstance = isInstance && "text" in value;
    isInstance = isInstance && "hiddenInput" in value;
    isInstance = isInstance && "hiddenOutput" in value;

    return isInstance;
}

export function CellFromJSON(json: any): Cell {
    return CellFromJSONTyped(json, false);
}

export function CellFromJSONTyped(json: any, ignoreDiscriminator: boolean): Cell {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': CellTypeFromJSON(json['type']),
        'text': json['text'],
        'hiddenInput': json['hiddenInput'],
        'hiddenOutput': json['hiddenOutput'],
    };
}

export function CellToJSON(value?: Cell | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'type': CellTypeToJSON(value.type),
        'text': value.text,
        'hiddenInput': value.hiddenInput,
        'hiddenOutput': value.hiddenOutput,
    };
}

