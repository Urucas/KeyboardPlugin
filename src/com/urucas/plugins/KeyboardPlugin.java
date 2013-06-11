package com.urucas.plugins;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

public class KeyboardPlugin extends CordovaPlugin {

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        
		if(action.equals("show")) {			
			InputMethodManager inputMethodManager = (InputMethodManager) this.cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
		    if (inputMethodManager != null) {
		        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
		    }
			return true;
        }
        return false;
    }	
}
