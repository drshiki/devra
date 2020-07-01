package moe.dam.devra.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import moe.dam.devra.entity.Task;

@UiController("devra_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
@LoadDataBeforeShow
public class TaskEdit extends StandardEditor<Task> {
}