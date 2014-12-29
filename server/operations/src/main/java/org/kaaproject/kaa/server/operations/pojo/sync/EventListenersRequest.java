/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.operations.pojo.sync;

import java.util.List;

public class EventListenersRequest {
    private String requestId;
    private List<String> eventClassFQNs;

    public EventListenersRequest() {
    }

    /**
     * All-args constructor.
     */
    public EventListenersRequest(String requestId, List<String> eventClassFQNs) {
        this.requestId = requestId;
        this.eventClassFQNs = eventClassFQNs;
    }

    /**
     * Gets the value of the 'requestId' field.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the 'requestId' field.
     * 
     * @param value
     *            the value to set.
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the 'eventClassFQNs' field.
     */
    public List<String> getEventClassFQNs() {
        return eventClassFQNs;
    }

    /**
     * Sets the value of the 'eventClassFQNs' field.
     * 
     * @param value
     *            the value to set.
     */
    public void setEventClassFQNs(List<String> value) {
        this.eventClassFQNs = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventClassFQNs == null) ? 0 : eventClassFQNs.hashCode());
        result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EventListenersRequest other = (EventListenersRequest) obj;
        if (eventClassFQNs == null) {
            if (other.eventClassFQNs != null) {
                return false;
            }
        } else if (!eventClassFQNs.equals(other.eventClassFQNs)) {
            return false;
        }
        if (requestId == null) {
            if (other.requestId != null) {
                return false;
            }
        } else if (!requestId.equals(other.requestId)) {
            return false;
        }
        return true;
    }

}
