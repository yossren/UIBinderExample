package com.jedfonner.examples.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HelloWorld extends Composite {

  interface MyUiBinder extends UiBinder<Widget, HelloWorld> {
  }
  interface UiStyle extends CssResource {
    String pretty();
    String ugly();
  }
  
  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  @UiField SpanElement nameSpan;
  @UiField UiStyle style;

  public HelloWorld() {
    initWidget(uiBinder.createAndBindUi(this));
    nameSpan.addClassName(style.ugly());
  }

  public void setName(String name) {
    nameSpan.setInnerText(name);
  }
}
