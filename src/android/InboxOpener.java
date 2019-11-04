package iterative.engineering.inbox.opener;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Intent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class InboxOpener extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d("app", "execute");
        if ("openInbox".equals(action)) {
            Log.d("app", "opening inbox");
            Intent intent=Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_EMAIL);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//Min SDK 15
            cordova.getActivity().startActivity(intent);
            return true;
        }
        return false;
    }
}
