package zrock.application.scriptme.create;

import zrock.application.scriptme.R;
import zrock.application.scriptme.activities.CreateActivity;

import android.content.Intent;
import android.content.Intent.ShortcutIconResource;

/**
 * This activity creates shortcuts
 */
public class CreateShortcutActivity extends CreateActivity {

   @Override
   public void listItemClick(int position) {
      // Fix check box
      Script s = m_list.getItem(position);
      m_list.setSelected(position, s.runAsRoot());
      ScriptSingleton.setInstance(s);

      // Create shortcut
      Intent shortcutIntent = new Intent(this, ShortcutActivity.class);
      shortcutIntent.putExtra("name", s.getName());
      shortcutIntent.putExtra("path", s.getFullPath());
      shortcutIntent.putExtra("runAsRoot", s.runAsRoot());
      shortcutIntent.putExtra("args", s.getArgs());
      shortcutIntent.putExtra("hideOutput", s.hideOutput());
      ShortcutIconResource iconResource = Intent.ShortcutIconResource
           .fromContext(this, R.drawable.ic_launcher);

      Intent intent = new Intent();
      intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
      intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, s.getName());
      intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconResource);
      setResult(RESULT_OK, intent);

      finish();
   }

   /**
    * @see sites.mjwhitta.scripter.ScriptListActivity#listItemLongClick(int)
    */
   @Override
   public void listItemLongClick(int position) {/* do nothing */}
}
