package com.intellij.plugin.buck.targets;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.plugin.buck.config.BuckSettingsProvider;

public class BuckTargetUtil {

  public static boolean isValidAbsoluteTarget(String target) {
    return target.matches("^//[\\s\\S]*:[\\s\\S]*$");
  }

  /**
   * @param target The absolute target in "//apps/myapp:app" pattern
   * @return The absolute path of the target, for example "apps/myapp"
   */
  public static String extractAbsoluteTarget(String target) {
    return target.substring(2, target.lastIndexOf(":"));
  }

  /**
   * Return the virtual file of the BUCK file of the given target
   */
  public static VirtualFile getBuckFileFromAbsoluteTarget(Project project, String target) {
    if (!isValidAbsoluteTarget(target)) {
      return null;
    }
    VirtualFile buckDir =
        project.getBaseDir().findFileByRelativePath(extractAbsoluteTarget(target));
    return buckDir != null ? buckDir.findChild("BUCK") : null;
  }

  public static String getCurrentSavedTarget(Project project) {
    if (BuckSettingsProvider.getInstance().getState().lastAlias == null) {
      return null;
    }
    return BuckSettingsProvider.getInstance().getState().lastAlias.get(project.getBasePath());
  }
}
