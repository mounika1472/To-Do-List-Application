 

package com.app.todolist.view.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by Sebastian Lutz on 15.02.2018.
 *
 * Service that gives data to AppWidgetProvider (TodoListWidget) class
 *
 */

public class ListViewWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetViewsFactory(getApplicationContext(), intent);

    }





}
