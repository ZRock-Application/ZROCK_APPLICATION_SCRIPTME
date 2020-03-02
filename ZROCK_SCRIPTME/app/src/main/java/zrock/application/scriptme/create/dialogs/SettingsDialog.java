package zrock.application.scriptme.create.dialogs;

import zrock.application.scriptme.R;
import zrock.application.scriptme.create.utils.StringUtils;
import zrock.application.scriptme.activities.CreateActivity;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * The dialog created when the user selects "Settings" from the menu.
 */
public abstract class SettingsDialog extends Dialog {
   /**
    * Constructor
    * 
    * @param activity
    */
   public SettingsDialog(final Activity activity) {
      super(activity);

      setContentView(R.layout.settings_dialog);
      setTitle("Settings");

      final EditText scriptsPath = (EditText) findViewById(R.id.scripts_path);
      scriptsPath.setText(((CreateActivity) activity).getScriptPaths());

      final Button okButton = (Button) findViewById(R.id.settings_ok_button);
      okButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            String newPath = scriptsPath.getText().toString().trim();
            if (!StringUtils.isNullorEmpty(newPath)) {
               onOkButton(newPath);
            }
         }
      });
   }

   /**
    * Actions to take when the OK button is clicked.
    * 
    * @param scriptsPath
    */
   public abstract void onOkButton(String scriptsPath);
}
