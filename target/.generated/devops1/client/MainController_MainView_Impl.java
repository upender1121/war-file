package devops1.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.user.client.Window;

public class MainController_MainView_Impl implements devops1.client.MainController.MainView {
  public MainController_MainView_Impl(){
    this.__view = "main";
  }
  public com.google.gwt.user.client.ui.TextBox nameTextBox(){
    org.cruxframework.crux.core.client.screen.views.View __view = org.cruxframework.crux.core.client.screen.views.View.getView(this.__view);
    assert(__view != null):"View ["+this.__view+"] was not loaded. Ensure that desired view is loaded by the application (through useView declaration).";
    return (com.google.gwt.user.client.ui.TextBox)__view.getWidget("nameTextBox");
  }
  public String getBoundCruxViewId(){
    return this.__view;
  }
  
  public org.cruxframework.crux.core.client.screen.views.View getBoundCruxView(){
    return (this.__view!=null?org.cruxframework.crux.core.client.screen.views.View.getView(this.__view):null);
  }
  
  public void bindCruxView(String view){
    this.__view = view;
  }
  
  public IsWidget _getFromView(String widgetName){
    org.cruxframework.crux.core.client.screen.views.View __view = org.cruxframework.crux.core.client.screen.views.View.getView(this.__view);
    assert (__view != null):"No view loaded with desired identifier.";
    IsWidget ret = __view.getWidget(widgetName);
    if (ret == null){
      String widgetNameFirstUpper;
      if (widgetName.length() > 1){
        widgetNameFirstUpper = Character.toUpperCase(widgetName.charAt(0)) + widgetName.substring(1);
      }
      else{
        widgetNameFirstUpper = ""+Character.toUpperCase(widgetName.charAt(0));
      }
      ret = __view.getWidget(widgetNameFirstUpper);
    }
    return ret;
  }
  private String __view;
}
