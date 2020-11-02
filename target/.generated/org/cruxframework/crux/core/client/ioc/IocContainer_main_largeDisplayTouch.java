package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_largeDisplayTouch extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_largeDisplayTouch(View view){
    super(view);
  }
  public  devops1.client.MainController.MainView getdevops1_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    devops1.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<devops1.client.MainController.MainView>(){
      public devops1.client.MainController.MainView get(){
        return GWT.create(devops1.client.MainController.MainView.class);
      }
    }, "devops1.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<devops1.client.MainController.MainView>(){
      public void onCreate(devops1.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
