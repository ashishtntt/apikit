/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.module.apikit.rest.resource;

import org.mule.module.apikit.rest.RestException;

public class ResourceNotFoundException extends RestException
{

    private static final long serialVersionUID = -2274813685894863042L;
    protected RestResource parentResource;
    protected String resourcePath;

    public ResourceNotFoundException(String path)
    {
        this(path, null);
    }

    public ResourceNotFoundException(String path, RestResource restResource)
    {
        this.parentResource = restResource;
        this.resourcePath = path;
    }
}
