package moe.dam.devra.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import moe.dam.devra.entity.Task;

@UiController("devra_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
@LoadDataBeforeShow
public class TaskBrowse extends StandardLookup<Task> {
}