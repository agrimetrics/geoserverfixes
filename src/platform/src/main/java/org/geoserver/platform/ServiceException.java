/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Base class for exceptions generated by a service.
 *
 * <p>This class is based off the OGC idea of an exception, which contains a {@link #code}, and
 * {@link #locator}. Futhermore optional fragments of {@link #exceptionText} may be associated with
 * the exception.
 *
 * @author Justin Deoliveira, The Open Planning Project, jdeolive@openplans.org
 * @author Andrea Aime - GeoSolutions
 */
public class ServiceException extends RuntimeException {
    /** Serial UID */
    private static final long serialVersionUID = 7254349181794561723L;

    public static final String NEW_LINE = System.getProperty("line.separator");

    public static final String MISSING_PARAMETER_VALUE = "MissingParameterValue";
    public static final String INVALID_PARAMETER_VALUE = "InvalidParameterValue";
    public static final String NO_APPLICABLE_CODE = "NoApplicableCode";
    public static final String UNSUPPORTED_COMBINATION = "UnsupportedCombination";
    public static final String NOT_ENOUGH_STORAGE = "NotEnoughStorage";
    public static final String INVALID_UPDATE_SEQUENCE = "InvalidUpdateSequence";
    public static final String CURRENT_UPDATE_SEQUENCE = "CurrentUpdateSequence";
    public static final String VERSION_NEGOTIATION_FAILED = "VersionNegotiationFailed";

    /** Application specfic code. */
    protected String code;

    /** Application specific locator */
    protected String locator;

    /** List of text recording information about the exception */
    List<String> exceptionText = new ArrayList<>();

    /**
     * Constructs the exception from a message.
     *
     * @param message The message describing the exception.
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Constructs the exception from a message and causing exception.
     *
     * @param message The message describing the exception.
     * @param cause The case of the exception.
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs the exception from a message, causing exception, and code.
     *
     * @param message The message describing the exception.
     * @param cause The case of the exception.
     * @param code The application specific exception code for the exception.
     */
    public ServiceException(String message, Throwable cause, String code) {
        this(message, cause);
        this.code = code;
    }

    /**
     * Constructs the exception from a message, causing exception, code, and locator.
     *
     * @param message The message describing the exception.
     * @param cause The case of the exception.
     * @param code The application specific exception code for the exception.
     * @param locator The application specific locator for the exception.
     */
    public ServiceException(String message, Throwable cause, String code, String locator) {
        this(message, cause, code);
        this.locator = locator;
    }

    /**
     * Constructs the exception from a message, and code.
     *
     * @param message The message describing the exception.
     * @param code The application specific exception code for the exception.
     */
    public ServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    /**
     * Constructs the exception from a message,code, and locator.
     *
     * @param message The message describing the exception.
     * @param code The application specific exception code for the exception.
     * @param locator The application specific locator for the exception.
     */
    public ServiceException(String message, String code, String locator) {
        this(message, code);
        this.locator = locator;
    }

    /**
     * Constructs the exception from a causing exception.
     *
     * @param cause The case of the exception.
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs the exception from causing exception, and code.
     *
     * @param cause The case of the exception.
     * @param code The application specific exception code for the exception.
     */
    public ServiceException(Throwable cause, String code) {
        this(cause);
        this.code = code;
    }

    /**
     * Constructs the exception from a causing exception, code, and locator.
     *
     * @param cause The case of the exception.
     * @param code The application specific exception code for the exception.
     * @param locator The application specific locator for the exception.
     */
    public ServiceException(Throwable cause, String code, String locator) {
        this(cause, code);
        this.locator = locator;
    }

    /** @return The application specifc code of the exception. */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code for the exception.
     *
     * @param code The application specific code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Chaining method for setting code.
     *
     * <p>This allows code to:
     *
     * <pre><code>
     * throw new ServiceException(...).code("someCode");
     * </code></pre>
     */
    public ServiceException code(String code) {
        setCode(code);
        return this;
    }

    /** @return The application specific locator. */
    public String getLocator() {
        return locator;
    }

    /** Sets the locator for the exception. */
    public void setLocator(String locator) {
        this.locator = locator;
    }

    /**
     * Chaining method for setting locator.
     *
     * <p>This allows code to:
     *
     * <pre><code>
     * throw new ServiceException(...).locator("someLocator");
     * </code></pre>
     */
    public ServiceException locator(String locator) {
        setLocator(locator);
        return this;
    }

    /**
     * Returns the list of text fragments which provide additonal information about the exception.
     *
     * <p>Text fragements may be added directly to the list with: <code>
     * exception.getExceptionTest().add( "text fragment" );
     * </code>
     *
     * @return A list of String recording information about the exception.
     */
    public List<String> getExceptionText() {
        return exceptionText;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        if (exceptionText == null || exceptionText.size() == 0) return msg;

        StringBuffer sb = new StringBuffer(msg);
        for (Iterator<String> it = exceptionText.iterator(); it.hasNext(); ) {
            String extraMessage = it.next();
            sb.append(NEW_LINE).append(extraMessage);
        }
        return sb.toString();
    }
}
