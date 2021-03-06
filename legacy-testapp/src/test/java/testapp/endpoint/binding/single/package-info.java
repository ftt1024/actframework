/*
 * @(#) package-info.java
 */

/**
 * This package defines the test cases that verify the
 * parameter binding for single parameter of 10 standard
 * types, including all primitive types(with their wrapper pair),
 * String, Enum, BigInteger and BigDecimal
 *
 * The verifications are a combination of the following
 * configurations:
 *
 * 1. request data: non-null|null
 * 2. http method: GET|POST
 *
 * For GET and POST there are different types of list data encode:
 * 1. `v=x&v=y` style
 * 2. `v[0]=x&v[3]=y` style
 * 3. `v.0=x&v.3=y` style
 * 4. `v[]=x&v[]=y` style
 * 5. JSON encoded body (for POST JSON only)
 */
package testapp.endpoint.binding.single;
