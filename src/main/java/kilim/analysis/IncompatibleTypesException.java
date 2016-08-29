/* Copyright (c) 2006, Sriram Srinivasan
 *
 * You may distribute this software under the terms of the license 
 * specified in the file "License"
 */
package kilim.analysis;

public class IncompatibleTypesException
        extends Exception
{
    private static final long serialVersionUID = 1270645277746840738L;

    public IncompatibleTypesException(String message)
    {
        super(message);
    }
}
