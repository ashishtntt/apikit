/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.apikit.rest;

import org.mule.api.MuleEvent;
import org.mule.module.apikit.rest.protocol.RestProtocolAdapter;

public interface RestRequest
{

    MuleEvent getMuleEvent();

    String getNextPathElement();
    
    String peekNextPathElement();

    boolean hasMorePathElements();

    RestProtocolAdapter getProtocolAdaptor();

    RestWebService getService();

    void setErrorPayload(String uri, String title, String detail, String statusCode);
}
