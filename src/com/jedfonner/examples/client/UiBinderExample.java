package com.jedfonner.examples.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class UiBinderExample implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network " + "connection and try again.";


  public void onModuleLoad() {
    //create UIBinder owner
    HelloWorld helloWorld = new HelloWorld();
//    Document.get().getBody().appendChild(helloWorld.getElement());
    RootPanel.get().add(helloWorld);
    helloWorld.setName("World");

    HelloWidgetWorld helloWidgetWorld = new HelloWidgetWorld("able", "baker", "charlie");
//    Document.get().getBody().appendChild(helloWidgetWorld.getElement());
    RootPanel.get().add(helloWidgetWorld);
    
    HelloButton helloButton = new HelloButton();
//    Document.get().getBody().appendChild(helloButton.getElement());
    RootPanel.get().add(helloButton);
  }
}
