package com.jedfonner.examples.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HelloButton extends Composite {
  
  interface MyUiBinder extends UiBinder<Widget, HelloButton>{}

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  @UiField Button button;
  
  public HelloButton() {
    //initWidget(button);
    initWidget(uiBinder.createAndBindUi(this));

    button.setText("Dynamic");
  }
  
  @UiHandler("button")
  void handleClick(ClickEvent e) {
    Window.alert("Hello, AJAX");
  }

}
