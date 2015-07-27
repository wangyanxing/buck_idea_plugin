package com.intellij.plugin.buck.build;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.plugin.buck.ui.BuckToolWindowFactory;
import org.jetbrains.annotations.NotNull;

public class BuckBuildNotification extends Notification {

  public static final NotificationGroup NOTIFICATION_GROUP_ID = NotificationGroup.toolWindowGroup(
      "Buck Build Messages", BuckToolWindowFactory.TOOL_WINDOW_ID);

  public BuckBuildNotification(
      @NotNull String groupDisplayId,
      @NotNull String title,
      @NotNull String content,
      @NotNull NotificationType type) {
    super(groupDisplayId, title, content, type);
  }

  @NotNull
  public static BuckBuildNotification createBuildFailedNotification(
      BuckBuildManager.Command buildCommand,
      String description) {
    String title = "Buck " + buildCommand.name().toLowerCase() + " failed";
    return new BuckBuildNotification(
        NOTIFICATION_GROUP_ID.getDisplayId(),
        title, description,
        NotificationType.ERROR);
  }
}
