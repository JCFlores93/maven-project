/** Clasess from udemy
* These classes contain the JAXB annotations.
*
* @since 1.0
* @author jeancarloflores
* @version 0.1
*/
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
   * @param someone the name of a person
   * @return  greeting string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

//continues
