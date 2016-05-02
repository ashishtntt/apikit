/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.raml.implv2.v10.model;

import org.mule.raml.interfaces.model.parameter.IParameter;

import java.util.List;

import org.raml.v2.model.common.ValidationResult;
import org.raml.v2.model.v10.datamodel.TypeDeclaration;

public class ParameterImpl implements IParameter
{

    private TypeDeclaration typeDeclaration;

    public ParameterImpl(TypeDeclaration typeDeclaration)
    {
        this.typeDeclaration = typeDeclaration;
    }

    @Override
    public boolean validate(String value)
    {
        List<ValidationResult> results = typeDeclaration.validate(value);
        return results.isEmpty();
    }

    @Override
    public String message(String value)
    {
        List<ValidationResult> results = typeDeclaration.validate(value);
        return results.isEmpty() ? "OK" : results.get(0).getMessage();
    }

    @Override
    public boolean isRequired()
    {
        return typeDeclaration.required();
    }

    @Override
    public String getDefaultValue()
    {
        return typeDeclaration.defaultValue();
    }

    @Override
    public boolean isRepeat()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getDisplayName()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getInstance()
    {
        throw new UnsupportedOperationException();
    }
}
