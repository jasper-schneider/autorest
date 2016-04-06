/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for putAsyncNoRetrycanceled operation.
 */
public class LROsPutAsyncNoRetrycanceledHeaders {
    /**
     * Location to poll for result status: will be set to
     * /lro/putasync/noretry/canceled/operationResults/200.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Location to poll for result status: will be set to
     * /lro/putasync/noretry/canceled/operationResults/200.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the azureAsyncOperation value.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation value.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the LROsPutAsyncNoRetrycanceledHeaders object itself.
     */
    public LROsPutAsyncNoRetrycanceledHeaders setAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the LROsPutAsyncNoRetrycanceledHeaders object itself.
     */
    public LROsPutAsyncNoRetrycanceledHeaders setLocation(String location) {
        this.location = location;
        return this;
    }

}
